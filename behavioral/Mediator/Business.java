package behavioral.Mediator;

public class Business {
    public static void main(String[] args) {

        Retail eva = new Eva();
        Retail auchan = new Auchan();

        eva.sendOrder("Ariel - 100 ящиков");
        auchan.sendOrder("Vanish - 150 ящиков");

    }
}