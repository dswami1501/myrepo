package java8.concept;

import java.util.*;
import java.util.stream.Collectors;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("One",1);
        m.put("Two",2);
        m.put("Three",3);
        m.put("Four",4);
        m.put("Five",5);

        //Todo: Normal Way: Collections sort() takes list as parameter with or without Comparator
        List<Map.Entry<String,Integer>> le = new ArrayList<>(m.entrySet());
        /*System.out.println(le);*/
        /*Collections.sort(le, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println(le);*/

        //Todo: using lambda with Collections sort()
        /*Collections.sort(le, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        System.out.println("Collections.sort() = "+le);*/

        //Todo: using lambda with List sort() in descending order
        /*le.sort((o1, o2) -> o2.getKey().compareTo(o1.getKey()));
        System.out.println("Listsort() = "+le);*/

        //Todo: Using Streams and Map.Entry's comparingByKey()
        /*le.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);*/

        //Todo: Using Streams and Map.Entry's comparingByKey(comparator)
        /*le.stream().sorted(Map.Entry.comparingByKey(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            })).forEach(System.out::println);*/

        //Todo: Using Streams and Map.Entry's comparingByKey(comparator's lambda) in reverse order
        /*le.stream().sorted(Map.Entry.comparingByKey((o1, o2) -> o2.compareTo(o1))).forEach(System.out::println);*/

        //Todo: Using Streams and Map.Entry's comparingByKey(Comparator's reverseOrder method) in reverse order
        /*le.stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);*/

        //Todo: Using Streams and Map.Entry's comparingByValue()
        /*le.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/

        //Todo: Using Streams and Map.Entry's comparingByValue(Comparator's reverseOrder method)
        /*le.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);*/

//===============================================================================================================================================
//Todo: Lets Play with Employee
        //TreeMap requires keys to be comparable or a comparator to be provided for sorting.
        //Todo: Normal Approach
        /*Map<Employee, Integer> mt = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId()> o2.getId()?1:-1;
            }
        });
        mt.put(new Employee(1,"deepak",18),1000);
        mt.put(new Employee(3,"rahul",20),1300);
        mt.put(new Employee(2,"ruchi",19),1200);
        mt.put(new Employee(5,"raj",22),1400);
        mt.put(new Employee(4,"sari",21),1300);
        System.out.println(mt);*/

        //Todo: Lambda Approach
        /*Map<Employee, Integer> mt = new TreeMap<>((o1, o2) -> o1.getId()> o2.getId()?1:-1);
        mt.put(new Employee(1,"deepak",18),1000);
        mt.put(new Employee(3,"rahul",20),1300);
        mt.put(new Employee(2,"ruchi",19),1200);
        mt.put(new Employee(5,"raj",22),1400);
        mt.put(new Employee(4,"sari",21),1300);
        System.out.println(mt);*/

        //Todo: Using Streams and Map.Entry.comparingByKey, Map.Entry.comparingByValue
        /*Map<Employee, Integer> tme = new TreeMap<>((o1, o2) -> o1.getId()> o2.getId()?1:-1);
        tme.put(new Employee(1,"deepak",18),1000);
        tme.put(new Employee(3,"rahul",20),1300);
        tme.put(new Employee(2,"ruchi",19),1200);
        tme.put(new Employee(5,"raj",22),1400);
        tme.put(new Employee(4,"sari",21),1300);
        System.out.println(tme);
        tme.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId).reversed())).forEach(System.out::println);*/
    }
}
