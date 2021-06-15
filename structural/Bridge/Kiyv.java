package structural.Bridge;

public class Kiyv extends Phone {
    protected Kiyv(Maps maps) {
        super(maps);
    }

    @Override
    public void navigate() {
        System.out.println("Конечная точка Киев");
        maps.guide();
    }
}
