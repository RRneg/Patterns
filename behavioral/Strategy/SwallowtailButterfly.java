package behavioral.Strategy;

public class SwallowtailButterfly {
    LifeCycle lifeCycle;

        public void setLifeCycle(LifeCycle lifeCycle){
        this.lifeCycle = lifeCycle;
        }
        public void doing(){
        lifeCycle.doing();
    }
}
