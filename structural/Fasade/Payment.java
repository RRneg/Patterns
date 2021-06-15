package structural.Fasade;

public class Payment {
public boolean paidUp;

    public boolean isPaidUp() {
        return paidUp;
    }

    public void startOverhaul(){
        System.out.println("Overhaul is in progress");
        paidUp = true;
    }

    public void stopOverhaul(){
        System.out.println("Overhaul is worth");
        paidUp = false;
    }
}
