package com.java8.java8.java8.testingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
    private int id;
    private String name;

    public EmployeeComparable(int id, String name) {
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
        return "new EmployeeComparable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //TODO: NOTE: To reverse the order just change the parameters position
    /*//TODO: Ascending Order
    @Override
    public int compareTo(EmployeeComparable o) {
        if(this.getId()>o.getId()){
            return 1;
        } else if (this.getId()>o.getId()) {
            return -1;
        }else {
            return 0;
        }
    }*/
    /*//TODO: Descending Order
    @Override
    public int compareTo(EmployeeComparable o) {
        if(this.getId()>o.getId()){
            return -1;
        } else if (this.getId()>o.getId()) {
            return 1;
        }else {
            return 0;
        }
    }*/
    /*//TODO: Ascending order using ternary operator
    public int compareTo(EmployeeComparable ec){
        return (this.getId()>ec.getId())?1:(this.getId()<ec.getId())?-1:0;
    }*/
    /*//TODO: Descending order using ternary operator
    public int compareTo(EmployeeComparable ec){
        return (this.getId()>ec.getId())?-1:(this.getId()<ec.getId())?1:0;
    }*/
    /*//TODO: Ascending order by returning and using Integer class's static method compareTo
    public int compareTo(EmployeeComparable o) {
        return Integer.compare(this.getId(),o.getId());
    }*/
    /*//TODO: Descending order by returning and using Integer class's static method compareTo
    public int compareTo(EmployeeComparable o) {
        return Integer.compare(o.getId(),this.getId());
    }*/

    //TODO: Extra condition to help you better
    //TODO: If you want to compare based on age first and, if the ages are the same,
    // compare based on names, you can use the following logic:
    public int compareTo(EmployeeComparable o) {
        int idComparison = Integer.compare(this.getId(), o.getId());

        if (idComparison == 0) {
            //TODO:  If ages are the same, compare based on names
            return this.name.compareTo(o.name);
        } else {
            return idComparison; //TODO:  Return the result of age comparison if ages are different
        }
    }

    public static void main(String[] args){
        List<EmployeeComparable> list = new ArrayList();
        list.add( new EmployeeComparable(1,"pradeep"));
        list.add( new EmployeeComparable(2,"ram"));
        list.add( new EmployeeComparable(3,"shyam"));
        list.add( new EmployeeComparable(1,"deepak"));
        list.add( new EmployeeComparable(5,"ravi"));

        System.out.println("List as it is "+list);
        Collections.sort(list);
        System.out.println("Sorted list in ascending/descending order: "+list);
    }
}
