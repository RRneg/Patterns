package behavioral.Mediator;

public interface Distributor {

    public void getOrderFromRetail(String order, Retail retail);
    public void sendOrderToManufacture(String order, Manufacturer manufacturer);
    public void getOrderFromManufacture(String order);
    public void sendOrderToRetail(String order);
}
