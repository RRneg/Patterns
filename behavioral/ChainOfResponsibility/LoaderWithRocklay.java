package behavioral.ChainOfResponsibility;

public class LoaderWithRocklay extends LogisticManager{
    public LoaderWithRocklay(int carrying) {
        super(carrying);
    }

    @Override
    public void distribute(String order) {
        System.out.println("Goods arrived on pallets " + order);

    }
}
