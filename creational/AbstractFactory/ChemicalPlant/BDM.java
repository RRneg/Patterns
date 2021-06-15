package creational.AbstractFactory.ChemicalPlant;

import creational.AbstractFactory.Manager;

public class BDM implements Manager {
    @Override
    public void sale() {
        System.out.println("BDM organizes sales");
    }
}
