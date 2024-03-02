package BehaviouralPattern.ObserverDesignPattern;

public class Subscriber implements Observer{

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println(this.name+" new video uploaded");
    }
}
