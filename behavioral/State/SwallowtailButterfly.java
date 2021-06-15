package behavioral.State;

public class SwallowtailButterfly {
    LifeCycle lifeCycle;

    public void setLifeCycle(LifeCycle lifeCycle){
        this.lifeCycle = lifeCycle;
        }

        public void cycleTransition(){
        if (lifeCycle instanceof Egg){
            setLifeCycle(new Caterpillar());
        }else
        if (lifeCycle instanceof Caterpillar){
            setLifeCycle(new CaseWorm());
        }else
        if(lifeCycle instanceof CaseWorm){
            setLifeCycle(new Butterfly());
        }else
        if (lifeCycle instanceof Butterfly){
            setLifeCycle(new Egg());
        }
        }

        public void doing(){
        lifeCycle.doing();
    }
}
