package creational.AbstractFactory.Hollywood;

import creational.AbstractFactory.Worker;

public class Actor implements Worker {
    @Override
    public void collect() {
        System.out.println("Actor plays a role");
    }
}
