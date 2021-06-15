package structural.Bridge;

public abstract class Phone {
    protected Maps maps;

    protected Phone (Maps maps) {
        this.maps = maps;
    }

    public abstract void navigate();

}
