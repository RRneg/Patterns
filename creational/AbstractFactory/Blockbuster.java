package creational.AbstractFactory;

import creational.AbstractFactory.Hollywood.Filmmaking;

public class Blockbuster {
    public static void main(String[] args) {

        BusinessCreation businessCreation = new Filmmaking();
        Engineer engineer = businessCreation.getEngineer();
        Worker worker = businessCreation.getWorker();
        Manager manager = businessCreation.getManager();

        System.out.println("Making a movie");
        engineer.develop();
        worker.collect();
        manager.sale();
    }
}
