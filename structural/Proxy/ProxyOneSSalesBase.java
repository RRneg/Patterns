package structural.Proxy;

public class ProxyOneSSalesBase implements OneSBase{
    private String ipServer;
    private OneSSalesBase monthOneSSalesBase;

    public ProxyOneSSalesBase(String ipServer) {
        this.ipServer = ipServer;
    }

    @Override
    public void report() {
        if(monthOneSSalesBase == null){
            monthOneSSalesBase = new OneSSalesBase(ipServer);
        }

        monthOneSSalesBase.report();

    }
}
