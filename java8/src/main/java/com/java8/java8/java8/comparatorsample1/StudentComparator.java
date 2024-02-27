package com.java8.java8.java8.comparatorsample1;

import java.util.*;
import java.util.stream.Collectors;

public class StudentComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Creating 10 Student objects and adding them to the list
        students.add(new Student(20, "John", "123 Main St"));
        students.add(new Student(22, "Alice", "456 Oak St"));
        students.add(new Student(21, "Bob", "789 Pine St"));
        students.add(new Student(23, "Eve", "101 Elm St"));
        students.add(new Student(19, "John", "202 Cedar St"));
        students.add(new Student(25, "Grace", "303 Maple St"));
        students.add(new Student(18, "Bob", "404 Birch St"));
        students.add(new Student(24, "Frank", "505 Walnut St"));
        students.add(new Student(20, "Helen", "606 Spruce St"));
        students.add(new Student(22, "Ivy", "707 Fir St"));

//Program1: .Sort on the basis of age, if age is the same, then on the basis of name: Start
        //Lambda Expression approach
        System.out.println("Collections.sort Ascending Order Start");
        /*Collections.sort(
                students,
                (s1, s2) -> s1.getAge().compareTo(s2.getAge())
        );*/
        Collections.sort(
                students,
                (s1, s2) -> {
                    if (s1.getAge()!=s2.getAge()) {
                        return s1.getAge().compareTo(s2.getAge());
                    }else {
                        return s1.getName().compareTo(s2.getName());
                    }
                }
        );
        /*System.out.println(students);*/
        /*for (Student student : students) {
            System.out.println(student);
        }*/
        students.forEach(student -> System.out.println(student));
        System.out.println("Collections.sort Ascending Order End");
        //The other way around
        /*Collections.sort(
                people,
                Comparator.comparing(Person::getFirstName)
        );*/

        System.out.println("Collections.sort Descending Order Start");
        Collections.sort(
                students,
                (s2, s1) -> {
                    if (s2.getAge()!=s1.getAge()) {
                        return s2.getAge().compareTo(s1.getAge());
                    }else {
                        return s2.getName().compareTo(s1.getName());
                    }
                }
        );
        /*System.out.println(students);*/
        students.forEach(student -> System.out.println(student));
        System.out.println("Collections.sort Descending Order End");

        System.out.println("In Ascending Order Start");
        students.sort(Comparator
                .comparing(Student::getAge) // First, compare by age
                .thenComparing(Student::getName) // If ages are equal, compare by name
        );
        students.forEach(System.out::println);
        System.out.println("In Ascending Order End");
        // Sorting the list in descending order based on age,
        // if ages are the same, then on the basis of name
        /*System.out.println("In Descending Order Start");
        students.sort(Comparator
                .comparing(Student::getAge).reversed()
                .thenComparing(Student::getName, Comparator.reverseOrder())
        );
        // Print the sorted list
        students.forEach(System.out::println);
        System.out.println("In Descending Order End");*/
//Program1: .Sort on the basis of age, if age is the same, then on the basis of name: End

//Program 2: Get the record whose age is greater than 20:Start
        List<Student> result = students.stream()
                .filter(student -> student.getAge() > 20)
                .collect(Collectors.toList());

        result.forEach(System.out::println);
//Program 2: Get the record whose age is greater than 20:End

//Program 3: Get the names only from the list of students: Start
        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);
//Program 3: Get the names only from the list of students: End

    }
}
