package behavioral.Observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> buildingMaterials);
}
