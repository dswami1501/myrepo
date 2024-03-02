package BehaviouralPattern.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer obs) {
        this.subscribers.add(obs);
    }

    @Override
    public void unSubscribe(Observer obs) {
        this.subscribers.remove(obs);
    }

    @Override
    public void notifyChanges() {
        for (Observer ob:this.subscribers){
            ob.notified();
        }
    }
}
