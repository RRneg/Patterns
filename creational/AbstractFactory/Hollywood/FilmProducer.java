package creational.AbstractFactory.Hollywood;

import creational.AbstractFactory.Manager;

public class FilmProducer implements Manager {
    @Override
    public void sale() {
        System.out.println("Film producer brings to pro");
    }
}
