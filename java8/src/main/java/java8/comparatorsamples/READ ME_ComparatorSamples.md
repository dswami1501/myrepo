# <u>ComparatorSamples</u>
## *PersonComparator*

```java
package java8.comparatorsamples;

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
```

## *PersonComparatorJava8*
```java
package java8.comparatorsamples;

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
```