package behavioral.ChainOfResponsibility;

public class LoaderDriver extends LogisticManager{
    public LoaderDriver(int carrying) {
        super(carrying);
    }

    @Override
    public void distribute(String order) {
        System.out.println("A lot of goods arrived on pallets " + order);

    }
}
