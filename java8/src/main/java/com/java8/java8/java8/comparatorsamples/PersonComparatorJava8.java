package com.java8.java8.java8.comparatorsamples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonComparatorJava8{
    private String name;
    private int age;
    private double height;

    public PersonComparatorJava8(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public PersonComparatorJava8() {
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonComparatorJava8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        List<PersonComparatorJava8> asd = new ArrayList<>();
        asd.add(new PersonComparatorJava8("Deep", 25,6.1));
        asd.add(new PersonComparatorJava8("Reep", 21,5.1));
        asd.add(new PersonComparatorJava8("Desk", 22,6.0));
        asd.add(new PersonComparatorJava8("John", 19,6.2));
        asd.add(new PersonComparatorJava8("Deep", 25,6.1));
        asd.add(new PersonComparatorJava8("Dash", 23,7.1));
        asd.add(new PersonComparatorJava8("Kirk", 26,6.9));
        asd.add(new PersonComparatorJava8("Josh", 19,6.2));

        System.out.println("Sorting on the basis of age: Start");
    List<PersonComparatorJava8> sortedByAge = asd.stream()
            .sorted(Comparator.comparing(PersonComparatorJava8::getAge))
            .collect(Collectors.toList());

        /*sortedByAge.forEach(person -> System.out.println(person.getName()));*/
        sortedByAge.forEach(System.out::println);
        System.out.println("Sorting on the basis of age: End");

        System.out.println("Sorting in descending order on the basis of age: Start");
    //If you want to sort in descending order based on age:
    List<PersonComparatorJava8> sortedByAgeDesc = asd.stream()
            .sorted(Comparator.comparing(PersonComparatorJava8::getAge).reversed())
            .collect(Collectors.toList());
        sortedByAgeDesc.forEach(System.out::println);
        System.out.println("Sorting in descending order on the basis of age: End");

        System.out.println("Sorting in based on multiple criteria: Start");
        //Sorting based on multiple criteria
    List<PersonComparatorJava8> sortedByMultipleCriteria = asd.stream()
            .sorted(Comparator.comparing(PersonComparatorJava8::getHeight)
                    .thenComparing(PersonComparatorJava8::getAge)
                    .thenComparing(PersonComparatorJava8::getName))
            .collect(Collectors.toList());
        sortedByMultipleCriteria.forEach(System.out::println);
        System.out.println("Sorting in based on multiple criteria: End");

        //Notes for Arrays
        //=================

        //1.Sorting Primitive Arrays:
        /*int[] intArray = {4, 2, 7, 1, 9};
        Arrays.sort(intArray);*/

        //1.2.Sorting Objects with Custom Comparator:
        /*Arrays.sort(personArray, Comparator.comparing(Person::getAge));*/

        //2.Sorting Object Arrays:For objects, the array elements must be comparable or a custom comparator should be provided.
        /*String[] stringArray = {"apple", "banana", "orange", "grape"};
        Arrays.sort(stringArray);*/

        //3.Sorting Part of an Array: You can specify a range to sort within the array.
        /*int[] partialArray = {4, 2, 7, 1, 9};
        Arrays.sort(partialArray, 1, 4); // Sort elements from index 1 to 3 (exclusive)*/

        //4.Sorting in Descending Order: To sort in descending order, you can use a custom comparator or reverse the array after sorting.
        /*Arrays.sort(intArray);
        // Reverse the array
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }*/

        //5.Sorting Objects with Comparable Interface: For objects, the class should implement the Comparable interface.
        /*public class Person implements Comparable<Person> {
            // Implement compareTo method
        }*/
    }
}
