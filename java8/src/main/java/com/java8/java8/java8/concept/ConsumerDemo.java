package java8.concept;

import java.util.function.Consumer;

public class ConsumerDemo {
    //Todo:Done
    //It will take Input but Never returns anything
    //It has two methods, accept() and andThen() for method chaining
    public static void main(String[] args) {
        Consumer<Integer> sqrMe = i -> System.out.println("SqrOutput: "+i*i);
        sqrMe.accept(3);
        Consumer<Integer> doubleMe = i -> System.out.println("DblOutput: "+2*i);
        doubleMe.accept(3);
        sqrMe.andThen(doubleMe).accept(4);
    }
}
