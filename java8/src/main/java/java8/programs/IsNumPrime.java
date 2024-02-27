package java8.programs;

import java.util.stream.IntStream;

public class IsNumPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
    public static boolean isPrime(int num){
        return num >1&& IntStream.range(2,num).noneMatch(n ->num%n==0);
    }
}
