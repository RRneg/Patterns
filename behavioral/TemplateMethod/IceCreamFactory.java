package behavioral.TemplateMethod;

public class IceCreamFactory {
    public static void main(String[] args) {

        IceCream vanilla = new VanillaIceCream();
        IceCream chocolate = new ChocolateIceCream();

        vanilla.makingIceCream();
        chocolate.makingIceCream();
    }
}
