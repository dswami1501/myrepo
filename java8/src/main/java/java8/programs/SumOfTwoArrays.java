package java8.programs;

import java.util.Arrays;

public class SumOfTwoArrays {
    public static void addElementsToNineJava7(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == 9) {
                    System.out.println(arr1[i] + " + " + arr2[j] + " = 9");
                }
            }
        }
    }

    public static void addElementsToNineJava8(int[] arr1, int[] arr2) {
        Arrays.stream(arr1)
                .forEach(a -> Arrays.stream(arr2)
                        .filter(b -> a + b == 9)
                        .forEach(b -> System.out.println(a + " + " + b + " = 9")));
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {5, 6, 3};

        System.out.println("Pairs with sum 9 (Java 7):");
        addElementsToNineJava7(arr1, arr2);

        System.out.println("Pairs with sum 9 (Java 8):");
        addElementsToNineJava8(arr1, arr2);
    }
}
