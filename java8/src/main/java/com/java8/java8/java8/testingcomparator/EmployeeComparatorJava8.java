package com.java8.java8.java8.testingcomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeComparatorJava8 {
    private int id;
    private String name;

    public EmployeeComparatorJava8() {
    }

    public EmployeeComparatorJava8(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "EmployeeComparatorJava8{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeComparatorJava8> employeeList = new ArrayList();
        employeeList.add( new EmployeeComparatorJava8(1,"pradeep"));
        employeeList.add( new EmployeeComparatorJava8(2,"ram"));
        employeeList.add( new EmployeeComparatorJava8(3,"shyam"));
        employeeList.add( new EmployeeComparatorJava8(1,"deepak"));
        employeeList.add( new EmployeeComparatorJava8(5,"ravi"));
//TODO: Approach1
        List<EmployeeComparatorJava8> sortedByAge = employeeList.stream()
                .sorted(Comparator.comparing(EmployeeComparatorJava8::getId))
                .collect(Collectors.toList());
        /*sortedByAge.forEach(person -> System.out.println(person));*/
        sortedByAge.forEach(System.out::println);
        System.out.println("Approach1 END");

//TODO: Approach2 to demonstrate Reverse using reversed():
        List<EmployeeComparatorJava8> sortedByAgeDesc = employeeList.stream()
                .sorted(Comparator.comparing(EmployeeComparatorJava8::getId).reversed())
                .collect(Collectors.toList());
        sortedByAgeDesc.forEach(System.out::println);
        System.out.println("Approach2 END");

//TODO: Approach3 to demonstrate Sorting based on multiple criteria using thenComparing()
        List<EmployeeComparatorJava8> sortedByMultipleCriteria = employeeList.stream()
                .sorted(Comparator.comparing(EmployeeComparatorJava8::getId)
                        .thenComparing(EmployeeComparatorJava8::getName))
                .collect(Collectors.toList());
        sortedByMultipleCriteria.forEach(System.out::println);
    }
}
