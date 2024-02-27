package com.java8.java8.java8.concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SliceAStream {
//Todo:Done
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<Integer> ages = empL.stream().map(abc -> abc.getAge()).collect(Collectors.toList());
        //Say you wanted to find 2nd and 3rd youngest employee age
        //Then you can slice the stream in order to get result using skip() and limit()
        List<Integer> ScndNdThrdYngstEmply = ages.stream().sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(ScndNdThrdYngstEmply);
    }
}
