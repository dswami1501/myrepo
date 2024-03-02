package CreationalPatterns.PrototypeDesignPattern;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        NetworkCon nc = new NetworkCon();
        nc.setIp("192.168.1.3");
        nc.loadData();
        System.out.println(nc);

        NetworkCon nc2 = (NetworkCon) nc.clone();
        System.out.println(nc2);
    }
}
