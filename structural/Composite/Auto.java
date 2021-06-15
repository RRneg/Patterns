package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    List<Autoparts> autopart = new ArrayList<>();

    public void addAutoparts(Autoparts autoparts){
       autopart.add(autoparts);
    }

    public void ride(){
        System.out.println("We go on a car trip");

        for (Autoparts autoparts: autopart){
            autoparts.start();
            }
    }
}
