package java8.programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondSmallestElement {
    public static int findSecondLargestJava7(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int findSecondLargestJava8(int[] arr) {
        return Arrays.stream(arr)
                .distinct() // Remove duplicates
                .boxed()    // Convert to Integer objects
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .limit(2)   // Limit to the first two elements
                .skip(1)    // Skip the first element (largest)
                .findFirst() // Find the second largest
                .orElse(Integer.MIN_VALUE); // If not found, return MIN_VALUE
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 7, 5, 8, 3 };

        int secondLargestJava7 = findSecondLargestJava7(arr);
        System.out.println("Second largest element (Java 7): " + secondLargestJava7);

        int secondLargestJava8 = findSecondLargestJava8(arr);
        System.out.println("Second largest element (Java 8): " + secondLargestJava8);
    }
}
