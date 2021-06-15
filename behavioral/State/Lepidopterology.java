package behavioral.State;

public class Lepidopterology {
    public static void main(String[] args) {
        LifeCycle lifeCycle = new Egg();
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();
        swallowtailButterfly.setLifeCycle(lifeCycle);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                swallowtailButterfly.doing();
                swallowtailButterfly.cycleTransition();
            }
            System.out.println();
            System.out.println("A new generation has appeared");
            System.out.println();
        }
    }
}
