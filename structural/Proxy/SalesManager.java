package structural.Proxy;

public class SalesManager {
    public static void main(String[] args) {
        OneSBase oneSBase = new ProxyOneSSalesBase("192.168.1.0.1");

        oneSBase.report();
    }
}