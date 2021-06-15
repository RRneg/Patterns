package behavioral.Mediator;

public class PG implements Manufacturer{
    Distributor stv = new STV();
    @Override
    public void getOrder(String order) {
        System.out.println("P&G принял заказ от дистрибьютора: " + order);
        sendOrder(order);
    }

    @Override
    public void sendOrder(String order) {
        System.out.println("P&G отгрузил заказ дистрибьютору: " + order);
        stv.getOrderFromManufacture(order);
    }
}
