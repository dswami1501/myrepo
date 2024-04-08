package java8.programs;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenAndOddPrinterByCompletableFutureNdStreams {
    private static Object obj = new Object();
    private static IntPredicate evenCondition = e -> e%2 == 0;
    private static IntPredicate oddCondition = e -> e%2 != 0;

    public static void main(String[] args) throws InterruptedException {
        //The reason you're getting an empty output without Thread.sleep(x) is
        //because the main thread doesn't wait for the asynchronous tasks started by CompletableFuture.runAsync() to complete before exiting.
        //Without the sleep, the main thread may exit before the async tasks have a chance to execute.
        //When you add Thread.sleep(1000), it pauses the main thread for 1 second, giving the async tasks time to execute and print the results.
        CompletableFuture.runAsync(()-> EvenAndOddPrinterByCompletableFutureNdStreams.printResults(oddCondition));
        CompletableFuture.runAsync(()-> EvenAndOddPrinterByCompletableFutureNdStreams.printResults(evenCondition));
        Thread.sleep(1000);
    }

    public static void printResults(IntPredicate condition){
        IntStream.rangeClosed(1,10).filter(condition).forEach(EvenAndOddPrinterByCompletableFutureNdStreams::execute);
    }

    public static void execute(int i){
        synchronized (obj){
            System.out.println("Thread Name: "+Thread.currentThread().getName()+" value: "+i);
            obj.notify();
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
