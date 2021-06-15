package creational.Builder;

public class TrevelCycleBuilder extends CycleBuilder{
    @Override
    void buildSpecies() {
        cycle.setSpecies(Species.TOURING);
    }

    @Override
    void buildSuspension() {
        cycle.setSuspension(Suspension.NON);
    }

    @Override
    void buildTranmission() {
        cycle.setTransmission(20);
    }
}
