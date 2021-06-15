package behavioral.Strategy;

public class Caterpillar implements LifeCycle {
    @Override
    public void doing() {
        System.out.println("Eat the leaves");
    }
}
