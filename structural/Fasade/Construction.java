package structural.Fasade;

public class Construction {
    Overhaul overhaul = new Overhaul();
    Payment payment = new Payment();
    Builder builder = new Builder();

    public void buildUp(){
        overhaul.renovateAnApartment();
        payment.startOverhaul();
        builder.builds(payment);

    }
}
