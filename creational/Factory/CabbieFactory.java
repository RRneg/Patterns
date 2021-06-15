package creational.Factory;

public class CabbieFactory implements DriverFactory{
    @Override
    public Driver createDriver() {
        return new Сabbie();
    }
}
