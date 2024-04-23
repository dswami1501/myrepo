package Thread.ProducerConsumer.UsingWaitNdNotify;

import java.util.List;

public class Producer implements Runnable{
    List<Integer> sharedList = null;
    final int MAX_SIZE = 5;
    private int i = 0;

    public Producer(List<Integer> sharedList){
        super();
        this.sharedList = sharedList;
    }

    @Override
    public void run(){
        while(true){
            try{
                produce(i++);
            }catch(InterruptedException ex){
                System.out.println("Producer exception "+ex);
            }
        }
    }
    public void produce(int i) throws InterruptedException{

        synchronized(sharedList){
            while(sharedList.size() == MAX_SIZE){
                System.out.println("SharedList is full... Waiting for consumer to consume");
                sharedList.wait();
            }
        }
        synchronized(sharedList){
            System.out.println("Producer producing element" + i);
            sharedList.add(i);
            Thread.sleep(1000);
            sharedList.notify();
        }
    }
}
