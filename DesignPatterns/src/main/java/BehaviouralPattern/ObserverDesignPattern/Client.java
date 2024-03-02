package BehaviouralPattern.ObserverDesignPattern;

public class Client{
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber user = new Subscriber("Deepak");
        Subscriber user1 = new Subscriber("Raj");

        channel.subscribe(user);
        channel.subscribe(user1);
        channel.notifyChanges();
    }
}
