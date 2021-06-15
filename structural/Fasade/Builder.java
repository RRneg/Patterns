package structural.Fasade;

public class Builder {
    Payment payment = new Payment();
    public void builds(Payment payment){
        if (payment.isPaidUp()){
            System.out.println("The builder is working");
        } else {
            System.out.println("The builder smokes");
        }
    }
}
