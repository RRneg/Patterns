package structural.Composite;

public class Transmission implements Autoparts{
    @Override
    public void start() {
        System.out.println("the transmission transmits torque to the wheels");
    }
}
