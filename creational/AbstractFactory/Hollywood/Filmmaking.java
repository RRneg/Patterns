package creational.AbstractFactory.Hollywood;

import creational.AbstractFactory.BusinessCreation;
import creational.AbstractFactory.Engineer;
import creational.AbstractFactory.Manager;
import creational.AbstractFactory.Worker;

public class Filmmaking implements BusinessCreation {
    @Override
    public Engineer getEngineer() {
        return new Screenwriter();
    }

    @Override
    public Worker getWorker() {
        return new Actor();
    }

    @Override
    public Manager getManager() {
        return new FilmProducer();
    }
}
