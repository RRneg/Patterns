package creational.Builder;

public class ChoiceCycle {
    CycleBuilder cycleBuilder;

    public void setCycleBuilder(CycleBuilder cycleBuilder) {
        this.cycleBuilder = cycleBuilder;
    }

    Cycle buildCycle(){
        cycleBuilder.createCycle();
        cycleBuilder.buildSpecies();
        cycleBuilder.buildSuspension();
        cycleBuilder.buildTranmission();
        Cycle cycle = cycleBuilder.getCycle();
        return cycle;
    }
}
