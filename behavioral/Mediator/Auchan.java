package behavioral.Mediator;

public class Auchan implements Retail{
    Distributor stv = new STV();


    @Override
    public void sendOrder(String order) {
        System.out.println("АШАН отправил на дистрибьютора ООО СТВ заказ: " + order);
        stv.getOrderFromRetail(order, new Auchan());
    }

    @Override
    public void getOrder(String order) {
        System.out.println("АШАН принял от дистрибьютора ООО СТВ заказ " + order);
    }
}
