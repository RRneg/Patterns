package creational.Factory;

public class RacerFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new Racer();
    }
}
