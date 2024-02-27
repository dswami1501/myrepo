package java8.concept;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
//Todo:Done
    public static void main(String[] args) {
        //It always returns but never accepts
        Supplier<Date> spl = () -> new Date();
        System.out.println("Current Date: "+spl.get());

        Supplier<Integer> spl1 = () -> 2+2;
        System.out.println("Result: "+spl1.get());

    }
}
