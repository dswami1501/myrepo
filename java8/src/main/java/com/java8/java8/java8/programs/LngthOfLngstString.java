package java8.programs;

import java.util.Arrays;

public class LngthOfLngstString {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Avocado","Grapes"};
        lngthOfLngstStrng(fruits);
    }
    public static void lngthOfLngstStrng(String[] dav){
        int maxLength = Arrays.stream(dav).mapToInt(abc -> abc.length()).max().orElse(0);
        System.out.println("maxLength: "+maxLength);
    }

}
