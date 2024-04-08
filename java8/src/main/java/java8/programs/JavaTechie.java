package java8.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaTechie {
    public static void main(String[] args) {
        //Todo: WAP to count the occurrence of each character in a string: Start
        String input = "iamsearching";
        System.out.println("Input String: "+input);
        //String[] ch = input.split("");
        /*Map<String, List<String>> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s -> s));
        System.out.println(collect);//output:- {a=[a, a], r=[r], c=[c], s=[s], e=[e], g=[g], h=[h], i=[i, i], m=[m], n=[n]}*/
        Map<String, Long> occurrence = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("occurrence "+occurrence);
        //Todo: WAP to count the occurrence of each character in a string: End

        //Todo: WAP o find the duplicate element in a given string: Start
        List<String> duplicateElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("duplicateElement "+duplicateElement);
        //Todo: WAP o find the duplicate element in a given string: End

        //Todo: WAP to find the unique element: Start
        List<String> uniqueElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("uniqueElement "+uniqueElement);
        //Todo: WAP to find the unique element: End

        //Todo: WAP to find first non-repeat element in a String: Start
        String FirstNonRepeatElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println("FirstNonRepeatElement which is not right "+FirstNonRepeatElement);
        //In the above approach we are getting non repeat character but not the first one which is "m"
        // because internally Java 8's Stream groupingBy converts it into HashMap so tell it explicitly to use Linked HashMap

        String FirstNonRepeatElementCorrectOne = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println("FirstNonRepeatElement which is correct one "+FirstNonRepeatElementCorrectOne);
        //Todo: WAP to find first non-repeat element in a String: End

        //Todo: WAP to find first repeat element in a String: Start
        String firstRepeatElement = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1).findFirst().get().getKey();
        System.out.println("firstRepeatElement "+firstRepeatElement);
        //Todo: WAP to find first repeat element in a String: End

        //Todo: WAP to find the second highest number from given array: Start
        int[] numbers = {5,11,22,27,3,6};
        System.out.println("numbers "+Arrays.toString(numbers));
        Integer secondHighestNum = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondHighestNum "+secondHighestNum);
        //Todo: WAP to find the second highest number from given array: End

        //Todo: WAP to find the second lowest number from given array: Start
        Integer secondLowestNum = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        System.out.println("secondLowestNum "+secondLowestNum);
        //Todo: WAP to find the second lowest number from given array: End

        //Todo: WAP to find the longest string from given array: Start
        String[] longestArray = {"java", "Deepak", "Swami", "bangalore"};
        System.out.println(Arrays.toString(longestArray));
        String longestString = Arrays.stream(longestArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("longestString "+longestString);
        //Todo: WAP to find the longest string from given array: End

        //Todo:WAP to find all elements from array who starts with 1:Start
        List<String> numWhoStartsWithOne = Arrays.stream(numbers).boxed().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println("numWhoStartsWithOne "+numWhoStartsWithOne);
        //Todo:WAP to find all elements from array who starts with 1:End

        //Todo:WAP to give example on String.join(): Start
        List<String> list = Arrays.asList("1", "2", "3", "4");
        String stringJoin = String.join("-", list);
        System.out.println("stringJoinExample "+stringJoin);
        //Todo:WAP to give example on String.join(): End

        IntStream.rangeClosed(1, 10).forEach(System.out::println);
//Output:
/*1
2
3
4
5
6
7
8
9
10*/
    }
}
