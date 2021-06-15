package creational.AbstractFactory.ChemicalPlant;

import creational.AbstractFactory.Engineer;

public class ChemistTechnologist implements Engineer {
    @Override
    public void develop() {
        System.out.println("Chemist technologist develops dishwashing detergent");
    }
}
