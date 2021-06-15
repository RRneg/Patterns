package behavioral.Observer;

public interface Observed {

    public void addBuilder(Observer observer);

    public void notifyObserver();
}
