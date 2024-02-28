# <u>Testingcomparator</u>
## *EmployeeArraysSorting*
```java
package java8.testingcomparator;

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
```

## *EmployeeComparable*
```java
package java8.testingcomparator;

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
```

## *EmployeeComparator*
```java
package java8.testingcomparator;

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
```

## *EmployeeComparatorJava8*
```java
package java8.testingcomparator;

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
```