package creational.Builder;

public class TrailCycleBuilder extends CycleBuilder{
    @Override
    void buildSpecies() {
        cycle.setSpecies(Species.MOUNTAIN);
    }

    @Override
    void buildSuspension() {
        cycle.setSuspension(Suspension.FULL);

    }

    @Override
    void buildTranmission() {
        cycle.setTransmission(12);
    }
}
