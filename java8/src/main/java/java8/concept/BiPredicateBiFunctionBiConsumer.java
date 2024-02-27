package java8.concept;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionBiConsumer {
//Todo:Done
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bipreSumOfTwo = (a,b) -> a+b >5;
        System.out.println("checkSumOfTwo: "+bipreSumOfTwo.test(2,5));

        BiFunction<Integer, Integer, Integer> bifiSumOfTwo = (a, b) -> a+b;
        System.out.println("returnSumOfTwo: "+bifiSumOfTwo.apply(2,5));

        BiConsumer<Integer, Integer> biconSumOfTwo = (a, b) -> {
            int i = a + b;
            System.out.println("TestingBiConsumer: "+i);
        };
        biconSumOfTwo.accept(7,1);
    }
}
