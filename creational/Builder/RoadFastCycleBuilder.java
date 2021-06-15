package creational.Builder;

public class RoadFastCycleBuilder extends CycleBuilder {
    @Override
    void buildSpecies() {
        cycle.setSpecies(Species.ROAD);
    }

    @Override
    void buildSuspension() {
        cycle.setSuspension(Suspension.NON);
    }

    @Override
    void buildTranmission() {
        cycle.setTransmission(22);
    }
}
