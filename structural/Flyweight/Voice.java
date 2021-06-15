package structural.Flyweight;

public class Voice implements Deputy{
    @Override
    public void speech() {
        System.out.println("Surrendered without a fight");
    }
}
