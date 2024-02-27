package com.java8.java8.java8.programs;

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
