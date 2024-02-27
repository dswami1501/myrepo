package com.java8.java8.java8.testingcomparator;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeArraysSorting {
    private int id;
    private String name;

    public EmployeeArraysSorting(int id, String name) {
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
        return "EmployeeArraysSorting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
//TODO: Demonstration of an Array sorting and printing
        int[] intArray = {4, 2, 7, 1, 9};
        Arrays.sort(intArray);
        Arrays.stream(intArray).forEach(System.out::println);

//TODO: Demonstration of sorting Employee Objects using Array and Reversing it
        EmployeeArraysSorting e1= new EmployeeArraysSorting(1,"pradeep");
        EmployeeArraysSorting e2= new EmployeeArraysSorting(2,"rahul");
        EmployeeArraysSorting e3= new EmployeeArraysSorting(3,"jay");
        EmployeeArraysSorting e4= new EmployeeArraysSorting(1,"deepak");
        EmployeeArraysSorting e5= new EmployeeArraysSorting(5,"rakesh");
        EmployeeArraysSorting[] eA = {e1,e2,e3,e4,e5};
        Arrays.sort(eA, Comparator.comparing(EmployeeArraysSorting::getId).thenComparing(EmployeeArraysSorting::getName).reversed());
        Arrays.stream(eA).forEach(System.out::println);
        /*Arrays.sort(personArray, Comparator.comparing(Person::getAge));*/

//TODO: Sorting Object Arrays:For objects, the array elements must be comparable or a custom comparator should be provided.
        String[] stringArray = {"apple", "banana", "orange", "grape"};
        Arrays.sort(stringArray);
        Arrays.stream(stringArray).forEach(System.out::println);

//TODO: Sorting Part of an Array: You can specify a range to sort within the array, Sort elements from index 1 to 3 (exclusive)
        int[] partialArray = {4, 2, 7, 1, 9};
        Arrays.sort(partialArray, 1, 4);
        Arrays.stream(partialArray).forEach(System.out::println);
    }
}
