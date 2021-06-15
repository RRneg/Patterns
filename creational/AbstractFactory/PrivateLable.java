package creational.AbstractFactory;

import creational.AbstractFactory.ChemicalPlant.ChemicalPlantStuff;

public class PrivateLable {
    public static void main(String[] args) {
        BusinessCreation businessCreation = new ChemicalPlantStuff();
        Engineer engineer = businessCreation.getEngineer();
        Worker worker = businessCreation.getWorker();
        Manager manager = businessCreation.getManager();

        System.out.println("We manufacture a product under the brand name Wallmart");
        engineer.develop();
        worker.collect();
        manager.sale();
    }
}
