package java8.programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaTechieNthHighestSalary {
    public static void main(String[] args) {
        //No Duplicates entry included in below map
        HashMap<String, Integer> nthHighestSalary = new HashMap<>();
        nthHighestSalary.put("Raj", 1700);
        nthHighestSalary.put("Desh", 1200);
        nthHighestSalary.put("Deepak", 1300);
        nthHighestSalary.put("Pradeep", 1100);
        nthHighestSalary.put("Aamir", 1400);
        nthHighestSalary.put("Rohit", 1600);
        nthHighestSalary.put("Chotu", 1500);

        //Second Highest Salary without Duplicates
        /*Map.Entry<String, Integer> secondHighestSalary = nthHighestSalary.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(1);
        System.out.println(stringIntegerEntry);*/

        Map.Entry<String, Integer> stringIntegerEntry = nThHighestSalaryWithoutDuplicateEntry(4,nthHighestSalary);
        System.out.println(stringIntegerEntry);

        //Duplicates entry included in below map
        HashMap<String, Integer> nthHighestSalary1 = new HashMap<>();
        nthHighestSalary1.put("Raj", 1700);
        nthHighestSalary1.put("Desh", 1200);
        nthHighestSalary1.put("Deepak", 1300);
        nthHighestSalary1.put("Pradeep", 1100);
        nthHighestSalary1.put("Aamir", 1400);
        nthHighestSalary1.put("Rohit", 1600);
        nthHighestSalary1.put("Chotu", 1500);
        nthHighestSalary1.put("Rakesh", 1500);

        //Second Highest Salary with Duplicates
        /*Map.Entry<Integer, List<String>> integerListEntry = nthHighestSalary1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
        System.out.println(integerListEntry);*/

        Map.Entry<Integer, List<String>> integerListEntry = nThHighestSalaryWithDuplicateEntry(3, nthHighestSalary1);
        System.out.println(integerListEntry);
    }

    //This below function will not work for duplicate entries
    public static Map.Entry<String, Integer> nThHighestSalaryWithoutDuplicateEntry(int num, Map<String, Integer> map){
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(num-1);
    }

    //This below function will work for duplicate entries
    public static Map.Entry<Integer, List<String>> nThHighestSalaryWithDuplicateEntry(int num, Map<String, Integer> map){
        return map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(num-1);
    }
}
