package BehaviouralPattern.ObserverDesignPattern;

public interface Subject {
    void subscribe(Observer obs);
    void unSubscribe(Observer obs);
    void notifyChanges();
}
