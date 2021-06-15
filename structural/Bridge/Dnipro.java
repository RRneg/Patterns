package structural.Bridge;

public class Dnipro extends Phone {

    protected Dnipro(Maps maps) {
        super(maps);
    }

    @Override
    public void navigate() {
        System.out.println("Конечная точка Днепр");
        maps.guide();
    }
}
