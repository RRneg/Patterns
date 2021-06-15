package behavioral.Observer;

public class WorkingProcess {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addBM("Drywall - 2 000");
        stock.addBM("Brick - 100 000");

        Observer subscriber = new Subscriber("CMU - 17");
        Observer subscriber1 = new Subscriber("Shabashniki disign groupe");
        Observer subscriber2 = new Subscriber("Freelance tiler");

        stock.addBuilder(subscriber);
        stock.addBuilder(subscriber1);
        stock.addBuilder(subscriber2);

stock.addBM("Expanded clay - 5 000 kG");


    }
}
