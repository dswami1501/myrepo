package java8.concept;

import java.util.function.Predicate;

public class PredicateDemo {
//Todo:Done
    public static void main(String[] args) {
        //For chaining use : and, or and negate
        Predicate<String> checkLength =s ->s.length() >=5;
        System.out.println("The length of string is greater than 5: "+checkLength.test("Deepak"));

        Predicate<String> checkEvenLength =s ->s.length()%2==0;
        System.out.println("The length of string is Even or Not: "+checkEvenLength.test("Swami"));

        System.out.println("with and: "+checkLength.and(checkEvenLength).test("Sagar"));

        System.out.println("with or: "+checkLength.or(checkEvenLength).test("Sagar"));

        System.out.println("with negate: "+checkLength.negate().test("Sagar"));
    }
}
