# <u>Programs</u>
## *DistinctElement*
```java
package java8.programs;

import java.util.Arrays;

public class DistinctElement {
    public static void main(String[] args) {
        int[] num ={1,5,2,3,1,4,1};
        distinctElement(num);
    }
    public static void distinctElement(int[] bah){
        Arrays.stream(bah).distinct().forEach(bas -> System.out.print(bas));
    }
}
```

## *Employee*
```java
package java8.programs;

public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

## *Employee1*
```java
package java8.programs;

import java.util.List;

public class Employee1 {
    private int id;
    private String name;
    private List<String> city;

    public Employee1(int id, String name, List<String> city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
```

## *FindCommonElmtInTwoArray*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElmtInTwoArray {
    public static void main(String[] args) {
        int[] num1 ={1,5,3,2};
        int[] num2 ={1,5,2,3,1,4,1};
        commonElements(num1, num2);
    }
    public static void commonElements(int[] ar1, int[] ar2){
        List<Integer> commonElement = Arrays.stream(ar1).filter(ar1N -> Arrays.stream(ar2).anyMatch(ar2N -> ar2N == ar1N)).boxed().collect(Collectors.toList());
        System.out.println(commonElement);
    }
}
```

## *IsNumPrime*
```java
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
```

## *LngthOfLngstString*
```java
package java8.programs;

import java.util.Arrays;

public class LngthOfLngstString {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Avocado","Grapes"};
        lngthOfLngstStrng(fruits);
    }
    public static void lngthOfLngstStrng(String[] dav){
        int maxLength = Arrays.stream(dav).mapToInt(abc -> abc.length()).max().orElse(0);
        System.out.println("maxLength: "+maxLength);
    }

}
```

## *MapNdFlatMapEmployeeComparator*
```java
package java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapNdFlatMapEmployeeComparator {
    public static void main(String[] args) {
        List<String> empCity = new ArrayList<>();
        empCity.add("Indore");
        empCity.add("Pune");
        empCity.add("Bangalore");
        Employee1 emp = new Employee1(1, "deepak", empCity);

        List<String> emp1City = new ArrayList<>();
        emp1City.add("Indore");
        emp1City.add("Bangalore");
        Employee1 emp1 = new Employee1(2, "deepak", emp1City);

        List<String> emp2City = new ArrayList<>();
        emp2City.add("Pune");
        emp2City.add("Chennai");
        emp2City.add("Bangalore");
        Employee1 emp2 = new Employee1(3, "daram", emp2City);

        List<String> emp3City = new ArrayList<>();
        emp3City.add("Pune");
        emp3City.add("Indore");
        emp3City.add("Bangalore");
        Employee1 emp3 = new Employee1(4, "pradeep", emp3City);

        List<Employee1> empL = Arrays.asList(emp, emp1, emp2, emp3);

        //Todo: Comparator Demo Start
        List<Employee1> descEmpId = empL.stream().sorted((o1, o2) -> (int) (o2.getId() - o1.getId())).collect(Collectors.toList());
        System.out.println("descEmpId: "+descEmpId);
        List<Employee1> top3Id = descEmpId.stream().limit(3).collect(Collectors.toList());
        System.out.println("top3Id: "+top3Id);
        List<Employee1> idLessThen3rdLargest = descEmpId.stream().skip(3).collect(Collectors.toList());
        System.out.println("idLessThen3rdLargest: "+idLessThen3rdLargest);
        //Todo: Comparator Demo End

        //Todo: Map And Flat Map Demo
        // Application of FlatMap: Example here, the cities are in "List of List" format it will look something like [["bhopal","Indore"]]
        // Problem with Normal Map is it cannot work upon 2D List, that's where FlatMap came into picture
        // For here we are going to convert the List of List into a single List
        // Below is Map example
        List<List<String>> listOfCitites = empL.stream().map(empObj -> empObj.getCity()).collect(Collectors.toList());
        System.out.println("listOfCitites: "+listOfCitites);

        //Below is FlatMap example
        /*Set<String> flaMapOfCities = empL.stream().flatMap(empOb -> empOb.getCity().stream()).collect(Collectors.toSet());
        System.out.println("flatMapOfCities: "+flaMapOfCities);*/
        Set<String> flaMapOfCities = empL.stream().flatMap(empOb -> empOb.getCity().stream()).collect(Collectors.toSet());
        System.out.println("flatMapOfCities: "+flaMapOfCities);

        //Map And Flat Map Demo
    }
}
```

## *P1_FindDuplicateElementsUsingStreams*
```java
package java8.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P1_FindDuplicateElementsUsingStreams {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"deepak", 31);
        Employee emp1 = new Employee(2,"deepak",30);
        Employee emp2 = new Employee(3,"daram",25);
        Employee emp3 = new Employee(4,"pradeep",20);
        Employee emp4 = new Employee(5,"debu",25);

        List<Employee> empL = new ArrayList<>();
        empL.add(emp);
        empL.add(emp1);
        empL.add(emp2);
        empL.add(emp3);
        empL.add(emp4);

        //Todo: First Approach
        /*List<String> allNames = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateElement = allNames.stream().filter(bac -> !uniqueNames.add(bac)).collect(Collectors.toSet());
        System.out.println("duplicateElement: "+duplicateElement);*/

        //Todo: Second Approach
        /*List<String> allNames = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        Map<String, Long> mapNames = allNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> names = mapNames.entrySet().stream().filter(dac -> dac.getValue() > 1).map(dac -> dac.getKey()).collect(Collectors.toList());
        System.out.println("names: "+names);*/

        //Todo: Third approach
        /*List<String> allNames = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        Set<String> names = allNames.stream().filter(fad -> Collections.frequency(allNames, fad) > 1).collect(Collectors.toSet());
        System.out.println("names: "+names);*/

    }
}
```

## *ReverseArrayOfIntegerInPlace*
```java
package java8.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayOfIntegerInPlace {
    public static void main(String[] args) {
        int[] num ={5,2,6,5,3,4,1};
        reverseArrInPlace(num);
    }
    public static void reverseArrInPlace(int[] abc){
        IntStream.range(0, abc.length/2).forEach(i -> {
            int temp = abc[i];
            abc[i]=abc[abc.length-i-1];
            abc[abc.length-i-1]= temp;
        });
        System.out.println("Reverse Array: "+Arrays.toString(abc));
    }
}
```

## *ScndSmllstElmFrmIntArrNdReduceDemo*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;

public class ScndSmllstElmFrmIntArrNdReduceDemo {
    public static void main(String[] args) {
        int[] num ={5,2,6,5,3,4,1};
        //Code snippet for reduce
        List<Integer> reduceDemo = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("reduceDemo: "+reduceDemo.stream().reduce((a,b)->a+b).get());
        //Code snippet for reduce
        fetchSecSmllstElm(num);
    }
    public static void fetchSecSmllstElm(int[] dac){
        int i = Arrays.stream(dac).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Doesn't have second smallest element"));
        System.out.println("Second smallest elememt in the given arr: "+i);
    }
}
```

## *SqrtOf10Prime*
```java
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
```

## *StngToUprCaseNdJoinWidComa*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StngToUprCaseNdJoinWidComa {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<String> ages = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        String bs = ages.stream().map(bac -> bac.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(bs);
    }
}
```

## *StringReverse*
```java
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
```