package behavioral.TemplateMethod;

public abstract class IceCream {


    public void makingIceCream() {
        System.out.println("Take a waffle cup");
        mix();
        System.out.println("Add ice cream");
        System.out.println();
    }

    public abstract void mix();
}
