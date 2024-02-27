package com.java8.java8.java8.comparatorsamples;

import java.util.*;

public class PersonComparator implements Comparable<PersonComparator>{
    //TODO: Create a class named PersonComparator with the following attributes: name (String), age (int), and height (double)
    private String name;
    private int age;
    private double height;

    public PersonComparator(){
    }

    public PersonComparator(String name, int age,double height){
        this.name =name;
        this.age =age;
        this.height =height;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
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
        return "PersonComparator{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + '}';
    }

    @Override
    public int compareTo(PersonComparator o) {
        //TODO: based on age
        /*if (this.age> o.age){
            return +1;
        }else if (this.age<o.age){
            return -1;
        }else {
            return 0;
        }*/

        //TODO: above condition using ternary operator
        return (this.age > o.age) ? 1 : (this.age < o.age) ? -1 : 0;
        //TODO: Use this below logic instead and to reverse just reverse the parameters
        /*return Integer.compare(this.age, o.age);*/
        //TODO: If you want to compare based on age first and, if the ages are the same,
        // compare based on names, you can use the following logic:
        /*int ageComparison = Integer.compare(this.age, o.age);

        if (ageComparison != 0) {
            return ageComparison; //TODO:  Return the result of age comparison if ages are different
        } else {
            //TODO:  If ages are the same, compare based on names
            return this.name.compareTo(o.name);
        }*/
    }

    public static void main(String[] args) {
        List<PersonComparator> gd = new ArrayList<>();
        gd.add(new PersonComparator("Deep", 21, 5.9));
        gd.add(new PersonComparator("Reed", 19, 5.8));
        gd.add(new PersonComparator("Dash", 20, 5.7));
        gd.add(new PersonComparator("Beef", 20, 5.4));
        gd.add(new PersonComparator("Advd", 23, 5.5));
        gd.add(new PersonComparator("Arun", 20, 5.4));
        //TODO: Before Sorting
        System.out.println(gd);
        //TODO: logic for comparable
        Collections.sort(gd);
        //TODO: After sorting
        System.out.println(gd);

        //TODO: Using Comparator using Inner Class
        Comparator<PersonComparator> asf = new Comparator<PersonComparator>(){
            public int compare(PersonComparator o1, PersonComparator o2) {
                /*if (o1.getHeight()> o2.getHeight()){
                    return -1;
                }else if (o1.getHeight()<o2.getHeight()){
                    return +1;
                }else {
                    return 0;
                }*/
                //TODO: use this below logic instead
                return Double.compare(o2.getHeight(), o1.getHeight());
            }
        };
        Collections.sort(gd, asf);
        System.out.println(gd);
    }
}
