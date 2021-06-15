package creational.AbstractFactory;

import creational.AbstractFactory.CarFactory.CarFactoryStaff;

public class DeLorean {
    public static void main(String[] args) {
        BusinessCreation businessCreation = new CarFactoryStaff();
        Engineer engineer = businessCreation.getEngineer();
        Worker worker = businessCreation.getWorker();
        Manager manager = businessCreation.getManager();

        System.out.println("Create DeLorean");
        engineer.develop();
        worker.collect();
        manager.sale();
    }
}
