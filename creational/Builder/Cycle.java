package creational.Builder;

public class Cycle {
    private Species species;
    private Suspension suspension;
    private int transmission;

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "species=" + species +
                ", suspension=" + suspension +
                ", transmission=" + transmission +
                '}';
    }
}
