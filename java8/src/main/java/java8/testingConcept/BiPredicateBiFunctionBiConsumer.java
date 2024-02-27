package java8.testingConcept;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionBiConsumer {
    public static void main(String[] args) {
//TODO: BiPredicate
        BiPredicate<Integer, Integer> checkBiPredicate = (a,b) -> a+b>5;
        System.out.println("TestingPredicate: "+checkBiPredicate.test(5,1));

//TODO: BiFunction
        BiFunction<Integer,Integer,Integer> checkingBiFunction = (a,b) -> a+b;
        System.out.println("TestingBiFunction: "+checkingBiFunction.apply(5,1));

//TODO: BiConsumer
        BiConsumer<Integer,Integer> checkingBiConsumer = (a,b) -> {
            int i = a + b;
            System.out.println("TestingBiConsumer: "+i);
        };
        checkingBiConsumer.accept(7,1);

//TODO: NOTE:Why there is no BiSupplier Function?, The Supplier funcion won't take any input and produces result,
// so it doesn't matter if it is about number of input
    }
}
