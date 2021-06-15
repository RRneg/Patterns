package structural.Proxy;

public class OneSSalesBase implements OneSBase{
    private String ipServer;

    public OneSSalesBase(String ipServer) {
        this.ipServer = ipServer;
        downLoad();
    }

    @Override
    public void report() {
        System.out.println("Forming a sales report");
    }

    public void downLoad(){
        System.out.println("Sales Base loading");
    }
}
