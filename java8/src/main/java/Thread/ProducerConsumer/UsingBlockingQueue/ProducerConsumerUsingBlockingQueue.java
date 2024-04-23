package Thread.ProducerConsumer.UsingBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerUsingBlockingQueue {
    public static void main(String [] args){
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Producer(blockingQueue));
        Thread thread2 = new Thread(new Consumer(blockingQueue));
        thread1.start();
        thread2.start();
    }
}
