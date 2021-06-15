package creational.AbstractFactory.ChemicalPlant;

import creational.AbstractFactory.BusinessCreation;
import creational.AbstractFactory.Engineer;
import creational.AbstractFactory.Manager;
import creational.AbstractFactory.Worker;

public class ChemicalPlantStuff implements BusinessCreation {
    @Override
    public Engineer getEngineer() {
        return new ChemistTechnologist();
    }

    @Override
    public Worker getWorker() {
        return new Packer();
    }

    @Override
    public Manager getManager() {
        return new BDM();
    }
}
