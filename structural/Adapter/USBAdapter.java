package structural.Adapter;

public class USBAdapter extends USBC implements MicroUSB{
    @Override
    public void charge() {
        fastCharge();
    }
}
