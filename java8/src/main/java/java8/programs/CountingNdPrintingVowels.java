package java8.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingNdPrintingVowels {
    public static void main(String[] args) {
        String name = "deepak Swami";
        System.out.println(countVowel(name));

        printVowel(name);
    }

    public static long countVowel(String nme){
        return nme.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch)!=-1)
                .count();
    }

    public static void printVowel(String nam){
        Set<Character> vowelSet =new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        nam.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> vowelSet.contains(ch))
                .forEach(System.out::println);
    }
}
