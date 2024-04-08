package java8.programs;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenAndOddPrinterByExecutorService {
    public static void main(String[] args) {
        //If you will not create the thread explicitly then CompletableFuture will be executed in Fork Join pool
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream .rangeClosed(1,100).forEach(num -> {
            CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num).thenApplyAsync(x -> {
                if (x%2!=0){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+ ": "+x);
                }
                return num;
            },executorService);
            oddCompletableFuture.join();

            CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num).thenApplyAsync(x -> {
                if (x%2==0){
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+ ": "+x);
                }
                return num;
            },executorService);
            evenCompletableFuture.join();
        });
        executorService.shutdown();
    }
}
