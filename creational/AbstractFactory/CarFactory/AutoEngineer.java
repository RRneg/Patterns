package creational.AbstractFactory.CarFactory;

import creational.AbstractFactory.Engineer;

public class AutoEngineer implements Engineer {
    @Override
    public void develop() {
        System.out.println("Auto engineer designs a car");
    }
}
