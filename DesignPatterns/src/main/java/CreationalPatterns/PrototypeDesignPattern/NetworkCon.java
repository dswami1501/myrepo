package CreationalPatterns.PrototypeDesignPattern;

public class NetworkCon implements Cloneable{
    private String ip;
    private String data;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void loadData() throws InterruptedException {
        this.data="This is the Data";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkCon{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
