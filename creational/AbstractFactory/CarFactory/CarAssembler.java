package creational.AbstractFactory.CarFactory;

import creational.AbstractFactory.Worker;

public class CarAssembler implements Worker {
    @Override
    public void collect() {
        System.out.println("Car assembler works on a conveyor belt");
    }
}
