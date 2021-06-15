package behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Observed{
List<String> buildingMaterials = new ArrayList<>();
List<Observer> builder = new ArrayList<>();

public void addBM(String bM){
    this.buildingMaterials.add(bM);
    notifyObserver();
}


    @Override
    public void addBuilder(Observer observer) {
this.builder.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: builder) {
           observer.handleEvent(this.buildingMaterials);
        }
    }
}
