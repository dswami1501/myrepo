package Thread.ProducerConsumer.UsingBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> blockingQueue = null;
    private int i = 0;

    public Producer(BlockingQueue<Integer> blockingQueue){
        super();
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run(){
        while(true){
            try{
                produce(i++);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void produce(int i) throws InterruptedException {
        System.out.println("Producer thread producing element" + i);
        blockingQueue.put(i);
        Thread.sleep(1000);
    }
}