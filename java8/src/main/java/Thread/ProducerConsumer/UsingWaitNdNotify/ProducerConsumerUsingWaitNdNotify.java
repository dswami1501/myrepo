package Thread.ProducerConsumer.UsingWaitNdNotify;

import java.util.ArrayList;
import java.util.List;

//Producer Consumer Problem using wait and notify
public class ProducerConsumerUsingWaitNdNotify{
    public static void main(String [] args){
        List<Integer> sharedList = new ArrayList<>();
        Thread thread1 = new Thread(new Producer(sharedList));
        Thread thread2 = new Thread(new Consumer(sharedList));
        thread1.start();
        thread2.start();
    }
}
