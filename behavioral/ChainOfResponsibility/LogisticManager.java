package behavioral.ChainOfResponsibility;

public abstract class LogisticManager {
    private int carrying;
    private LogisticManager nextCarrig;

    public LogisticManager(int carrying) {
        this.carrying = carrying;
    }

    public void setNextCarrig(LogisticManager nextCarrig) {
        this.nextCarrig = nextCarrig;
    }

    public void carringOrder(String order, int weight){
        if(weight >= carrying){
            distribute(order);
        }
        if (nextCarrig != null){
            nextCarrig.carringOrder(order, weight);
        }
    }

    public abstract void distribute(String order);
}
