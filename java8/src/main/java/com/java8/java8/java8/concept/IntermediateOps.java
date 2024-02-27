package com.java8.java8.java8.concept;

import java.util.Arrays;
import java.util.List;

public class IntermediateOps {
//Todo:Done
    public static void main(String[] args) {
        Employee emp = new Employee(1,"deepak", 31);
        Employee emp1 = new Employee(2,"deepak",30);
        Employee emp2 = new Employee(3,"daram",25);
        Employee emp3 = new Employee(4,"pradeep",20);
        Employee emp4 = new Employee(5,"debu",15);

        /*List<Employee> empL = new ArrayList<>();
        empL.add(emp);
        empL.add(emp1);
        empL.add(emp2);
        empL.add(emp3);
        empL.add(emp4);*/
        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
//Intermediate operations: filter(), map(), sorted(), limit(), skip()// They are lazy, returns new Stream 
// and without terminal operator they won't work
//here limit() is also a short circuit Operator
//First Approach: filter() and map()
        intList.stream()
                .filter(a ->a%2==0)
                .map(a ->a+a)
                .filter(a ->a>5)
                .forEach(a -> System.out.println(a));

    }
}
