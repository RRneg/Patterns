package behavioral.Observer;

import java.util.List;

public class Subscriber implements Observer{
    String builder;

    public Subscriber(String builder) {
        this.builder = builder;
    }

    @Override
    public void handleEvent(List<String> buildingMaterials) {
        System.out.println("Сообщение для " +  builder + " На складе появились новые стройматериалы " + buildingMaterials);
    }
}
