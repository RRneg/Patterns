package behavioral.Memento;

public class Photo {
    String color;
    int size;

    public void setColorAndHigh(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Model{" +
                "color = " + color + '\'' +
                ", size = " + size +
                '}';
    }

    public Save save() {
        return new Save(color, size);
    }

    public void load(Save save) {
        color = save.getColor();
        size = save.getSize();
    }
}
