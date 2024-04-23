package Thread.ProducerConsumer.UsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> blockingQueue = null;

    public Consumer(BlockingQueue<Integer> blockingQueue){
        super();
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run(){
        while(true){
            try{
                consume();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void consume() throws InterruptedException{
        System.out.println("Consumer thread consumed element" + blockingQueue.take());
        Thread.sleep(100);
    }
}

