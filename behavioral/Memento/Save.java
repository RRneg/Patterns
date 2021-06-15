package behavioral.Memento;

public class Save {
    private final String color;
    private final int size;


    public Save(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }


}
