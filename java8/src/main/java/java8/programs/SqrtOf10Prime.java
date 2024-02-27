package java8.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SqrtOf10Prime {
    public static void main(String[] args) {
        List<Double> sqrtOfFirst10PrimeNum = Stream.iterate(1, i -> i + 1)
                .filter(SqrtOf10Prime::isPrime).peek(x -> System.out.print(", "+x))
                .map(Math::sqrt)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(sqrtOfFirst10PrimeNum);


    }

    public static boolean isPrime(int num){
        return num >1&& IntStream.range(2,num).noneMatch(n ->num%n==0);
    }
}
