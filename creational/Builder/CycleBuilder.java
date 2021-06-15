package creational.Builder;

public abstract class CycleBuilder {
    Cycle cycle;


    void createCycle(){
        cycle = new Cycle();
    }

    abstract void buildSpecies();
    abstract void buildSuspension();
    abstract void buildTranmission();

    Cycle getCycle(){
        return cycle;
    }

}
