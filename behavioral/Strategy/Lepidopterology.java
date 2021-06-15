package behavioral.Strategy;

public class Lepidopterology {
    public static void main(String[] args) {
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();
        swallowtailButterfly.setLifeCycle(new Egg());
        swallowtailButterfly.doing();

        swallowtailButterfly.setLifeCycle(new Caterpillar());
        swallowtailButterfly.doing();

        swallowtailButterfly.setLifeCycle(new CaseWorm());
        swallowtailButterfly.doing();

        swallowtailButterfly.setLifeCycle(new Butterfly());
        swallowtailButterfly.doing();

    }
}
