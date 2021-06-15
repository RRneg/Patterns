package creational.Builder;

public class CycleBuildRunner {
    public static void main(String[] args) {
        ChoiceCycle choiceCycle = new ChoiceCycle();
        choiceCycle.setCycleBuilder(new TrailCycleBuilder());
        Cycle cycle = choiceCycle.buildCycle();

        System.out.println(cycle);
    }
}
