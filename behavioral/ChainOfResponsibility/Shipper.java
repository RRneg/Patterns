package behavioral.ChainOfResponsibility;

public class Shipper {
    public static void main(String[] args) {
        LogisticManager smallWeight = new Loader(Carrying.LOADER);
        LogisticManager mediumWeight = new LoaderWithRocklay(Carrying.LWR);
        LogisticManager largeWeight = new LoaderDriver(Carrying.LD);


        smallWeight.setNextCarrig(mediumWeight);
        mediumWeight.setNextCarrig(largeWeight);

        smallWeight.carringOrder("Goods arrived", Carrying.LOADER);
        smallWeight.carringOrder("Help unload", Carrying.LWR);
        smallWeight.carringOrder("We will not unload without you", Carrying.LD);
    }
}
