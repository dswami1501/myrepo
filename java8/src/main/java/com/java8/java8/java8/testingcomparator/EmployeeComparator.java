package com.java8.java8.java8.testingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator implements Comparator<EmployeeComparator> {
    private int id;
    private String name;

    public EmployeeComparator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeComparator() {

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
        return "EmployeeComparator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//TODO: This is just to demonstrate the descending order
// likewise you can see "EmployeeComparable class" to perform other operation
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return (o1.getId()> o2.getId())?-1:(o1.getId()< o2.getId())?1:0;
    }

    public static void main(String[] args) {
        List<EmployeeComparator> list = new ArrayList();
        list.add( new EmployeeComparator(1,"pradeep"));
        list.add( new EmployeeComparator(2,"ram"));
        list.add( new EmployeeComparator(3,"shyam"));
        list.add( new EmployeeComparator(1,"deepak"));
        list.add( new EmployeeComparator(5,"ravi"));

        System.out.println("List as it is "+list);
        EmployeeComparator employeeComparator = new EmployeeComparator();
        Collections.sort(list, employeeComparator);
        System.out.println("Sorted list in ascending/descending order using Comparator: \n"+list);

//TODO: Inner Class used for Implementing Comparator
        Comparator<EmployeeComparator> newComparator = new Comparator<EmployeeComparator>() {
            @Override
            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
                return (o1.getId()> o2.getId())?1:(o1.getId()< o2.getId())?-1:0;
            }
        };
        Collections.sort(list, newComparator);
        System.out.println("Sorted list in ascending/descending order using Inner Class: \n"+list);
    }
}
