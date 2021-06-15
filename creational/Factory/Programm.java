package creational.Factory;

public class Programm {
    public static void main(String[] args) {
        DriverFactory driverFactory = createDriverBySpecilty("trucker");
        Driver driver = driverFactory.createDriver();
        driver.go();
    }
    static DriverFactory createDriverBySpecilty(String specialty){
        if (specialty.equalsIgnoreCase("racer")){
            return new RacerFactory();
        }
        else if (specialty.equalsIgnoreCase("trucker")){
            return new TruckerFactory();
        }
        else if (specialty.equalsIgnoreCase("cabbie")){
            return new CabbieFactory();
        }
        else
            throw new  RuntimeException(specialty + " is unknown specility");
    }
}
