package java8.programs;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String originalString = "Hello, Java 8!";

        String reversedString1 = reverseWithStringBuilder(originalString);
        System.out.println("Reversed String (StringBuilder): " + reversedString1);
        String reversedString2 = reverseUsingIntStreamRangeMethod(originalString);
        System.out.println("Reversed String (IntStreamRangeMethod): "+reversedString2);
        String reversedString3 = reverseUsingStreamOfMethod(originalString);
        System.out.println("Reversed String (StreamOfMethod): "+reversedString3);
        String reversedString4 = reverseUsingCharsMethod(originalString);
        System.out.println("Reversed String (CharsMethod): "+reversedString4);

    }

    private static String reverseWithStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseUsingIntStreamRangeMethod(String str) {
        if (str == null) {
            return null;
        }

        char[] charArray = str.toCharArray();
        System.out.println("charArray: "+charArray.toString());
        return IntStream.range(0, str.length())
                .mapToObj(i -> charArray[str.length() - i - 1])
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static String reverseUsingStreamOfMethod(String str) {
        if (str == null) {
            return null;
        }

        return Stream.of(str)
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());
    }

    public static String reverseUsingCharsMethod(String str) {
        if (str == null) {
            return null;
        }

        /*return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a2, b2) -> b2 + a2);*/

//Todo: above method can also be handled in below manner
        Optional<String> reversedOptional = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((a, b) -> b + a);

        return reversedOptional.orElse("");
    }

}

