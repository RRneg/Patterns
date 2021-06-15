package creational.AbstractFactory.Hollywood;

import creational.AbstractFactory.Engineer;

public class Screenwriter implements Engineer {
    @Override
    public void develop() {
        System.out.println("Screenwriter writes the script");
    }
}
