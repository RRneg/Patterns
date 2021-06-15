package creational.AbstractFactory.CarFactory;

import creational.AbstractFactory.Manager;

public class СarSalesman implements Manager {
    @Override
    public void sale() {
        System.out.println("Сar seller forms a dealer network");
    }
}
