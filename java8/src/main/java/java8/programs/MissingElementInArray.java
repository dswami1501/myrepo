package java8.programs;

import java.util.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] ar ={1,4,3,5};
        System.out.println("\nMissing Element in Java7 : "+missingElementInArray(ar));
        System.out.println("\nMissing Element in Java8 : "+findMissingElement(ar));
    }
    public static int missingElementInArray(int[] ar){
        int n = ar.length+1;
        System.out.println("n value is: "+n);
        int expectedSum = n*(n+1)/2;
        int originalSum=0;
        for(int num: ar){
            System.out.print(num +", ");
            originalSum = originalSum+num;
        }
        return expectedSum-originalSum;
    }

    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1;
        long totalSum = n * (n + 1) / 2;
        long arraySum = Arrays.stream(arr).asLongStream().sum();
        return (int) (totalSum - arraySum);
    }
}
