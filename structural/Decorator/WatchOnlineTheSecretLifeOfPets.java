package structural.Decorator;

public class WatchOnlineTheSecretLifeOfPets {
    public static void main(String[] args) {
        Cat cat = new BritishHouseCat(new HouseCat(new FelisCatus()));

        System.out.println(cat.live());
    }
}
