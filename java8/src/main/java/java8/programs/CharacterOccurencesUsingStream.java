package java8.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterOccurencesUsingStream {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'a', 'a', 'c', 'b'};
        java8(chars);
        java7(chars);
    }

    public static void java8(char[] ch){
        // Using streams to count occurrences of characters
        Map<Character, Long> charCounts = IntStream.range(0, ch.length)
                .mapToObj(i -> ch[i])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the character counts
        charCounts.forEach((character, count) -> System.out.println(character + " Java8 = " + count));
    }

    public static void java7(char[] ch){
        // Count occurrences of characters
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : ch) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Print the character counts
        charCounts.forEach((character, count) -> System.out.println(character + " java7 = " + count));
    }
}
