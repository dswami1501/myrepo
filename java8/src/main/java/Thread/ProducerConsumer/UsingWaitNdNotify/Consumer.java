package Thread.ProducerConsumer.UsingWaitNdNotify;

import java.util.List;

public class Consumer implements Runnable{
    List<Integer> sharedList = null;

    public Consumer(List<Integer> sharedList){
        super();
        this.sharedList = sharedList;
    }

    @Override
    public void run(){
        while(true){
            try{
                consume();
            }catch(InterruptedException ex){
                System.out.println("Consumer exception "+ex);
            }
        }
    }

    public void consume() throws InterruptedException{

        synchronized(sharedList){
            while(sharedList.isEmpty()){
                System.out.println("SharedList is empty... Waiting for Producer to produce");
                sharedList.wait();
            }
        }
        synchronized(sharedList){
            Thread.sleep(1000);
            System.out.println("Consumed the element" + sharedList.remove(0));
            sharedList.notify();
        }
    }
}
