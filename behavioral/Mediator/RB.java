package behavioral.Mediator;

public class RB implements Manufacturer{
    Distributor stv = new STV();
    @Override
    public void getOrder(String order) {
        System.out.println("Reckitt Benckiser принял заказ от дистрибьютора: " + order);
        sendOrder(order);
    }

    @Override
    public void sendOrder(String order) {
        System.out.println("Reckitt Benckiser отгрузил заказ дистрибьютору: " + order);
        stv.getOrderFromManufacture(order);
    }
}
