package behavioral.ChainOfResponsibility;

public class Loader extends LogisticManager{
    public Loader(int carrying) {
        super(carrying);
    }

    @Override
    public void distribute(String order) {
        System.out.println("Order came " + order);
    }
}
