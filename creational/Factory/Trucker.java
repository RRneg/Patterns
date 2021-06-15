package creational.Factory;

public class Trucker implements Driver{
    @Override
    public void go() {
        System.out.println("Trucker carrying cargo");
    }
}
