package creational.Factory;

public class TruckerFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new Trucker();
    }
}
