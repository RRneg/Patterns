package creational.AbstractFactory.CarFactory;

import creational.AbstractFactory.BusinessCreation;
import creational.AbstractFactory.Engineer;
import creational.AbstractFactory.Manager;
import creational.AbstractFactory.Worker;

public class CarFactoryStaff implements BusinessCreation {

    @Override
    public Engineer getEngineer() {
        return new AutoEngineer();
    }

    @Override
    public Worker getWorker() {
        return new CarAssembler();
    }

    @Override
    public Manager getManager() {
        return new СarSalesman();
    }
}
