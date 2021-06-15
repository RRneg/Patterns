package structural.Composite;

public class AutoTravel {
    public static void main(String[] args) {


        Auto auto = new Auto();

        Autoparts fuel = new Fuel();
        Autoparts gasEngine = new Engine();
        Autoparts electricalEngine = new Engine();
        Autoparts transmission = new Transmission();
        Autoparts wheels = new Wheels();


        auto.addAutoparts(fuel);
        auto.addAutoparts(electricalEngine);
        auto.addAutoparts(gasEngine);
        auto.addAutoparts(transmission);
        auto.addAutoparts(wheels);

        auto.ride();

    }
}
