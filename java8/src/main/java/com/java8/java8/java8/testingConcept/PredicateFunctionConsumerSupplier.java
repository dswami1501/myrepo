package java8.testingConcept;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumerSupplier {

    public static void main(String[] args) {
//TODO: Predicate
        Predicate<String> checkLength = s -> s.length() > 5;
        System.out.println("Checking length of String using Predicate: "+checkLength.test("Deepak"));

        Predicate<String> checkingEvenOrOdd = s -> s.length()%2==0;
        System.out.println("Checking length of String is Even Or Not "+checkingEvenOrOdd.test("Swami"));
//TODO: Predicate chaining use : and, or and negate
        System.out.println("with and: "+checkLength.and(checkingEvenOrOdd).test("Sagar"));

        System.out.println("with or: "+checkLength.or(checkingEvenOrOdd).test("Sagar"));

        System.out.println("with negate: "+checkLength.negate().test("Sagar"));

//TODO: Function
        Function<Integer,Integer> doubleIt = i ->2*i;
        System.out.println("After doubling: "+doubleIt.apply(2));

        Function<Integer,Integer> cubeIt = i ->i*i*i;
        System.out.println("After doubling: "+cubeIt.apply(2));
//Todo: Function chaining use: andThen(), compose()
        System.out.println("First Doubling Using Apply: "+doubleIt.andThen(cubeIt).apply(2));

        System.out.println("First Cubing Using Compose: "+doubleIt.compose(cubeIt).apply(2));

//TODO: Consumer
        Consumer<Integer> sqrMe = i -> System.out.println("SqrOutput: "+i*i);
        sqrMe.accept(3);
        Consumer<Integer> doubleMe = i -> System.out.println("DblOutput: "+2*i);
        doubleMe.accept(3);
//Todo: Consumer chaining use: accept(), andThen()
        sqrMe.andThen(doubleMe).accept(4);
    }
}
