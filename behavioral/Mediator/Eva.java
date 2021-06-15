package behavioral.Mediator;

public class Eva implements Retail{
    Distributor stv = new STV();

    @Override
    public void sendOrder(String order) {
        System.out.println("Ева отправил на дистрибьютора ООО СТВ заказ: " + order);
        stv.getOrderFromRetail(order,new Eva());
    }

    @Override
    public void getOrder(String order) {
        System.out.println("Ева приняла от дистрибьютора ООО СТВ заказ " + order);
    }
}
