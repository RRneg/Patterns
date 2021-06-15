package creational.AbstractFactory.ChemicalPlant;

import creational.AbstractFactory.Worker;

public class Packer implements Worker {
    @Override
    public void collect() {
        System.out.println("The packer puts the dishwashing detergent into the crates");
    }
}
