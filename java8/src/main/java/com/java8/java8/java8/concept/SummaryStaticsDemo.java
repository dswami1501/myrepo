package com.java8.java8.java8.concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStaticsDemo {
//Todo:Done
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);

//Summary statics works on IntStream only not on every stream so you have to use mapToInt() in order to get the IntStream.
//SummaryStatics can be used To calculate getMin(), getMax(), getSum() or getAverage()
        List<Integer> ages = empL.stream().map(abc -> abc.getAge()).collect(Collectors.toList());
        long max = ages.stream().mapToInt(x -> x).summaryStatistics().getSum();
        System.out.println(max);
    }
}
