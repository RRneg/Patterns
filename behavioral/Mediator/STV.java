package behavioral.Mediator;

public class STV implements Distributor{
    private static Retail retail;
    private Manufacturer manufacturer;




    public void setRetail(Retail retail) {
        this.retail = retail;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void getOrderFromRetail(String order, Retail retail) {
       setRetail(retail);
       System.out.println("Дистрибьютор ООО СТВ принял заказ: " + order + " от торговой сети ");
       sendOrderToManufacture(order, determineManufacturer(order));
    }

    @Override
    public void sendOrderToManufacture(String order, Manufacturer manufacturer) {
        System.out.println("Дистрибьютор ООО СТВ передал заказ: " + order + " производителю ");
        manufacturer.getOrder(order);
    }

    @Override
    public void getOrderFromManufacture(String order) {
        System.out.println("Дистрибьютор ООО СТВ получил заказ: " + order + " от производителя ");
        sendOrderToRetail(order);

    }

    @Override
    public void sendOrderToRetail(String order) {
        System.out.println("Дистрибьютор ООО СТВ отправил заказ " + order + " в торговую сеть ");
         retail.getOrder(order);

    }

    public Manufacturer determineManufacturer(String order){
        if(order.contains("Ariel")){
            setManufacturer(new PG());
            }
        else if (order.contains("Vanish")){
            setManufacturer(new RB());
            }
        return manufacturer;

    }

}
