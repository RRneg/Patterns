package structural.Adapter;

public class Phone {
    public static void main(String[] args) {
        MicroUSB microUSB = new USBAdapter();

        microUSB.charge();
    }
}
