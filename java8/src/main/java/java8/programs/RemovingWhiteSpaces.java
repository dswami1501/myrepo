package java8.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        String input = "     My      name   is  Deepak         Swami    ";
        java7(input);
        java8(input);
    }

    public static void java7(String input){
        // Split the input string into words
        String[] words = input.trim().split("\\s+");

        // Join the words back together with a single space between each word
        String output = String.join(" ", words);

        // Print the output string
        System.out.println("java7 "+output);
    }

    public static void java8(String input){
        String output = Arrays.stream(input.trim().split("\\s+"))  // trim and Split the input string into String[]
                .collect(Collectors.joining(" ")); // Join the words back together with a single space between each word

        System.out.println("java8 "+output); // Print the output string
    }
}
