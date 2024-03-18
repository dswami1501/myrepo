# <u> TestingConcept </u>
## *BiPredicateBiFunctionBiConsumer*
```java
package java8.testingConcept;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionBiConsumer {
    public static void main(String[] args) {
//TODO: BiPredicate
        BiPredicate<Integer, Integer> checkBiPredicate = (a,b) -> a+b>5;
        System.out.println("TestingPredicate: "+checkBiPredicate.test(5,1));

//TODO: BiFunction
        BiFunction<Integer,Integer,Integer> checkingBiFunction = (a,b) -> a+b;
        System.out.println("TestingBiFunction: "+checkingBiFunction.apply(5,1));

//TODO: BiConsumer
        BiConsumer<Integer,Integer> checkingBiConsumer = (a,b) -> {
            int i = a + b;
            System.out.println("TestingBiConsumer: "+i);
        };
        checkingBiConsumer.accept(7,1);

//TODO: NOTE:Why there is no BiSupplier Function?, The Supplier funcion won't take any input and produces result,
// so it doesn't matter if it is about number of input
    }
}
```

## *Employee*
```java
package java8.testingConcept;

public class Employee {
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
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

    public void getEmployeeInfo(){
        System.out.println("Method in Employee Class");
    }

    public void printName(){
        System.out.println("In Emp Class: "+name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
```

## *EmployeeManager*
```java
package java8.testingConcept;

public interface EmployeeManager {
    public Employee getEmployee();
}
```

## *IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps*
```java
package java8.testingConcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps {
    public static void print(Employee employee){
        System.out.println(employee);
    }
    public List<Employee> loadEmployeeFromDb(){
        return IntStream.rangeClosed(1,10).mapToObj(i -> new Employee(i, "employee"+i)).collect(Collectors.toList());
    }

    public static String staticEmployeeToString(Employee emp){
        Employee employeeDo = new Employee();
        employeeDo.setId(emp.getId());
        employeeDo.setName(emp.getName());
        return employeeDo.toString();
    }

    public String instanceEmployeeToString(Employee emp){
        Employee employeeDo = new Employee();
        employeeDo.setId(emp.getId());
        employeeDo.setName(emp.getName());
        return employeeDo.toString();
    }

    public static Optional<Employee> getEmp(String name){
        Employee emp = new Employee(1, name);
        return Optional.of(emp);//Todo: In case you are sure that the value is not null
        /*return Optional.ofNullable(emp);*///Todo: In case you are not sure about value then use this
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1,"pradeep");
        Employee emp1 = new Employee(1,"deepak");
        Employee emp2 = new Employee(3,"daram");
        Employee emp3 = new Employee(4,"rama");
        Employee emp4 = new Employee(5,"debu");

//Todo: Intermediate operations START
    //Todo: Intermediate operations: filter(), map(), sorted(), limit(), skip()// They are lazy, returns new Stream
    // and without terminal operator they won't work
    // here limit() is also a short circuit Operator
    // First Approach: filter() and map()
        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        empL.stream()
                .filter(a ->a.getId()%2==0)
                .map(a ->a.getId()+a.getId())
                .filter(a ->a>5)
                .forEach(a -> System.out.println("From Empoyee List: "+a));
    //Todo: Other Example of Intermediate operations
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        intList.stream()
                .filter(a ->a%2==0)
                .map(a ->a+a)
                .filter(a ->a>5)
                .forEach(a -> System.out.println("From Integer List: "+a));
//Todo: Intermediate operations END

//Todo: MethodReferenceNdConstructorRef START
        /*Todo: Syntax: Object::methodName*/
        //Todo: anonymous impl
        empL.stream().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.print("anonymous impl: "+employee+"\n");
            }
        });
        System.out.println("anonymous impl END");

        //Todo: Lambda impl
        empL.stream().forEach(employee -> System.out.print("Lambda impl: "+employee+"\n"));
        System.out.println("Lambda impl END");

//Todo: static method reference start
        //Todo: Method reference impl with custom print
        empL.stream().forEach(IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps::print);
        System.out.println("Method reference impl with custom print END");

        //Todo: Method reference impl with predefined print or println
        empL.stream().forEach(System.out::print);
        System.out.println();
        System.out.println("Method reference impl with predefined println END");

        //Todo: Another static method reference example
        IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps test = new IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps();
        List<String> employeeList = test.loadEmployeeFromDb().stream().map(IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps::staticEmployeeToString).collect(Collectors.toList());
        System.out.print("Another static method reference example: "+employeeList);
        System.out.println();
        System.out.println("Another static method reference example END");
//Todo: static method reference end

//Todo: instance method reference start
        IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps test1 = new IntrmdteOpsNdMthodRefNdCnstrRefNdOptinlNdSliceAStreamNdSummaryStaticsNdTrmnlOps();
        List<String> instanceEmployeeDoList = test1.loadEmployeeFromDb().stream().map(test1::instanceEmployeeToString).collect(Collectors.toList());
        System.out.println("Instance method reference: "+instanceEmployeeDoList);
        System.out.println("Instance method reference END");
//Todo: instance method reference end

//Todo: Constructor reference Start
        //Todo: Syntax: constructor :: new
        // using lambda for constructor
        EmployeeManager empTest = () -> new Employee();
        empTest.getEmployee().getEmployeeInfo();
        System.out.println("using lambda for constructor END");

        //Todo: using constructor reference for constructor
        EmployeeManager manager1 = Employee::new;
        manager1.getEmployee().getEmployeeInfo();
        System.out.println("using constructor reference for constructor");
//Todo: Constructor reference End

//Todo: Different UseCase Start
        //Todo: In below case getName is not static but we can still call it without using any object reference because method without parameter are treated as static
        // in java 8 so need to use object reference we can call it directly using class name
        List<String> stringName = test1.loadEmployeeFromDb().stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println("Different UseCase Start: "+stringName);
//Todo: Different UseCase End

//Todo: Optional Start
    //Todo:Optional.of(emp);//In case you are sure that the value is not null
    // Optional.ofNullable(emp);*///In case you are not sure about value then use this
    // optionalEmp.isPresent returns boolean value
    // optionalEmp.isPresentOrElse()
    // optionalEmp.get() will retrieve the object in case it is present otherwise it will throw error
    // optionalEmp.orElse(new Employee(1, name, 31)); This will return the value if it is present otherwise orElse's value
    // .get() and .orElseThrow() are same methods
    // optionalEmp.orElseGet(Supplier Function)

        Optional<Employee> samEmp = getEmp("sam");
        if (samEmp.isPresent()){
            System.out.println(samEmp.get().getName());
        }else {
            System.out.println(0);
        }
        System.out.println("Optional Demo End");
//Todo: Optional End

//Todo: SliceAStream Start
        List<Integer> ids = empL.stream().map(abc -> abc.getId()).collect(Collectors.toList());
    //Todo: Say you wanted to find 2nd and 3rd youngest employee age
    // Then you can slice the stream in order to get result using skip() and limit()
        List<Integer> ScndNdThrdYngstEmply = ids.stream().sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(ScndNdThrdYngstEmply);
        System.out.println("SliceAStream END");
//Todo: SliceAStream End

//Todo: SummaryStaticsDemo Start
    //Todo: Summary statics works on IntStream only not on every stream so you have to use mapToInt() in order to get the IntStream.
    // SummaryStatics can be used To calculate getMin(), getMax(), getSum() or getAverage()
        List<Integer> id = empL.stream().map(abc -> abc.getId()).collect(Collectors.toList());
        long max = id.stream().mapToInt(x -> x).summaryStatistics().getSum();
        System.out.println(max);
    //Todo:Below commented code evaluates same as above code
        /*long id = empL.stream().mapToInt(abc -> abc.getId()).summaryStatistics().getSum();
        System.out.println(id);*/
        System.out.println("SummaryStaticsDemo End");
//Todo: SummaryStaticsDemo End

//Todo: TerminalOps Start
    //Todo: Terminal operations: forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
    // Terminal Operators are Eager loaded and they can't be chained together like Intermediate operator and
    // Terminal Op. should be used at end only.
    // Intermediate operators are lazy loaded
    // You won't get any output from this as it is lazy loaded and to get output we do have to use terminal operator in the end.
    // In Terminal Operators there are short circuit operators as well like: findFirst(), findAny(), anyMatch(), allMatch(), noneMatch()
        /*empL.stream().filter(abc ->abc.getId()%2==0).map(dac -> {
            dac.printName();
            return dac.getName();
        });*/
    //Todo: Same as above operation but with terminal operator to get the output
        empL.stream().filter(abc ->abc.getId()%2==0).map(dac -> {
            dac.printName();
            return dac.getName();
        }).forEach(dac -> System.out.println("At Last: "+dac));
        System.out.println("TerminalOps End");
//Todo: TerminalOps End
//Todo: MethodReferenceNdConstructorRef END
    }
}
```

## *PredicateFunctionConsumerSupplier*
```java
package java8.testingConcept;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumerSupplier {

    public static void main(String[] args) {
//TODO: Predicate
        Predicate<String> checkLength = s -> s.length() > 5;
        System.out.println("Checking length of String using Predicate: "+checkLength.test("Deepak"));

        Predicate<String> checkingEvenOrOdd = s -> s.length()%2==0;
        System.out.println("Checking length of String is Even Or Not "+checkingEvenOrOdd.test("Swami"));
//TODO: Predicate chaining use : and, or and negate
        System.out.println("with and: "+checkLength.and(checkingEvenOrOdd).test("Sagar"));

        System.out.println("with or: "+checkLength.or(checkingEvenOrOdd).test("Sagar"));

        System.out.println("with negate: "+checkLength.negate().test("Sagar"));

//TODO: Function
        Function<Integer,Integer> doubleIt = i ->2*i;
        System.out.println("After doubling: "+doubleIt.apply(2));

        Function<Integer,Integer> cubeIt = i ->i*i*i;
        System.out.println("After doubling: "+cubeIt.apply(2));
//Todo: Function chaining use: andThen(), compose()
        System.out.println("First Doubling Using Apply: "+doubleIt.andThen(cubeIt).apply(2));

        System.out.println("First Cubing Using Compose: "+doubleIt.compose(cubeIt).apply(2));

//TODO: Consumer
        Consumer<Integer> sqrMe = i -> System.out.println("SqrOutput: "+i*i);
        sqrMe.accept(3);
        Consumer<Integer> doubleMe = i -> System.out.println("DblOutput: "+2*i);
        doubleMe.accept(3);
//Todo: Consumer chaining use: accept(), andThen()
        sqrMe.andThen(doubleMe).accept(4);
    }
}
```

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

# <u>Programs</u>
## *SumOfTwoArrays*
```java
package java8.programs;

import java.util.Arrays;

public class SumOfTwoArrays {
    public static void addElementsToNineJava7(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == 9) {
                    System.out.println(arr1[i] + " + " + arr2[j] + " = 9");
                }
            }
        }
    }

    public static void addElementsToNineJava8(int[] arr1, int[] arr2) {
        Arrays.stream(arr1)
                .forEach(a -> Arrays.stream(arr2)
                        .filter(b -> a + b == 9)
                        .forEach(b -> System.out.println(a + " + " + b + " = 9")));
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4};
        int[] arr2 = {5, 6, 3};

        System.out.println("Pairs with sum 9 (Java 7):");
        addElementsToNineJava7(arr1, arr2);

        System.out.println("Pairs with sum 9 (Java 8):");
        addElementsToNineJava8(arr1, arr2);
    }
}
```

## *MissingElementInArray*
```java
package java8.programs;

import java.util.Arrays;

public class MissingElementInArray {
    public static void main(String[] args) {
        int[] ar ={1,4,3,5};
        System.out.println("\nMissing Element in Java7 : "+missingElementInArray(ar));
        System.out.println("\nMissing Element in Java8 : "+findMissingElement(ar));
    }
    public static int missingElementInArray(int[] ar){
        int n = ar.length+1;
        System.out.println("n value is: "+n);
        int expectedSum = n*(n+1)/2;
        int originalSum=0;
        for(int num: ar){
            System.out.print(num +", ");
            originalSum = originalSum+num;
        }
        return expectedSum-originalSum;
    }

    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1;
        long totalSum = n * (n + 1) / 2;
        long arraySum = Arrays.stream(arr).asLongStream().sum();
        return (int) (totalSum - arraySum);
    }
}
```

## *SecondSmallestElement*
```java
package java8.programs;

import java.util.Arrays;
import java.util.Comparator;

public class SecondSmallestElement {
    public static int findSecondLargestJava7(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int findSecondLargestJava8(int[] arr) {
        return Arrays.stream(arr)
                .distinct() // Remove duplicates
                .boxed()    // Convert to Integer objects
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .limit(2)   // Limit to the first two elements
                .skip(1)    // Skip the first element (largest)
                .findFirst() // Find the second largest
                .orElse(Integer.MIN_VALUE); // If not found, return MIN_VALUE
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 7, 5, 8, 3 };

        int secondLargestJava7 = findSecondLargestJava7(arr);
        System.out.println("Second largest element (Java 7): " + secondLargestJava7);

        int secondLargestJava8 = findSecondLargestJava8(arr);
        System.out.println("Second largest element (Java 8): " + secondLargestJava8);
    }
}
```

## *RemovingWhiteSpaces*
```java
package java8.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
        String input = "     My      name   is  Deepak         Swami    ";
        java7(input);
        java8(input);
    }

    public static void java7(String input){
        // Split the input string into words
        String[] words = input.trim().split("\\s+");

        // Join the words back together with a single space between each word
        String output = String.join(" ", words);

        // Print the output string
        System.out.println("java7 "+output);
    }

    public static void java8(String input){
        String output = Arrays.stream(input.trim().split("\\s+"))  // trim and Split the input string into String[]
                .collect(Collectors.joining(" ")); // Join the words back together with a single space between each word

        System.out.println("java8 "+output); // Print the output string
    }
}
```

## *CharacterOccurencesUsingStream*
```java
package java8.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterOccurencesUsingStream {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'a', 'a', 'c', 'b'};
        java8(chars);
        java7(chars);
    }

    public static void java8(char[] ch){
        // Using streams to count occurrences of characters
        Map<Character, Long> charCounts = IntStream.range(0, ch.length)
                .mapToObj(i -> ch[i])
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the character counts
        charCounts.forEach((character, count) -> System.out.println(character + " Java8 = " + count));
    }

    public static void java7(char[] ch){
        // Count occurrences of characters
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : ch) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Print the character counts
        charCounts.forEach((character, count) -> System.out.println(character + " java7 = " + count));
    }
}
```

## *FindDuplicateUsingStreams*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);

        // Using streams to find duplicate elements
        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Print duplicate elements
        duplicates.forEach(System.out::println);
    }
}
```

## *CountingNdPrintingVowels*
```java
package java8.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingNdPrintingVowels {
    public static void main(String[] args) {
        String name = "deepak Swami";
        System.out.println(countVowel(name));

        printVowel(name);
    }

    public static long countVowel(String nme){
        return nme.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch)!=-1)
                .count();
    }

    public static void printVowel(String nam){
        Set<Character> vowelSet =new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        nam.chars()
                .mapToObj(ch -> (char)ch)
                .filter(ch -> vowelSet.contains(ch))
                .forEach(System.out::println);
    }
}
```

## *DistinctElement*
```java
package java8.programs;

import java.util.Arrays;

public class DistinctElement {
    public static void main(String[] args) {
        int[] num ={1,5,2,3,1,4,1};
        distinctElement(num);
    }
    public static void distinctElement(int[] bah){
        Arrays.stream(bah).distinct().forEach(bas -> System.out.print(bas));
    }
}
```

## *Employee*
```java
package java8.programs;

public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

## *Employee1*
```java
package java8.programs;

import java.util.List;

public class Employee1 {
    private int id;
    private String name;
    private List<String> city;

    public Employee1(int id, String name, List<String> city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
```

## *FindCommonElmtInTwoArray*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElmtInTwoArray {
    public static void main(String[] args) {
        int[] num1 ={1,5,3,2};
        int[] num2 ={1,5,2,3,1,4,1};
        commonElements(num1, num2);
    }
    public static void commonElements(int[] ar1, int[] ar2){
        List<Integer> commonElement = Arrays.stream(ar1).filter(ar1N -> Arrays.stream(ar2).anyMatch(ar2N -> ar2N == ar1N)).boxed().collect(Collectors.toList());
        System.out.println(commonElement);
    }
}
```

## *IsNumPrime*
```java
package java8.programs;

import java.util.stream.IntStream;

public class IsNumPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
    public static boolean isPrime(int num){
        return num >1&& IntStream.range(2,num).noneMatch(n ->num%n==0);
    }
}
```

## *LngthOfLngstString*
```java
package java8.programs;

import java.util.Arrays;

public class LngthOfLngstString {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Avocado","Grapes"};
        lngthOfLngstStrng(fruits);
    }
    public static void lngthOfLngstStrng(String[] dav){
        int maxLength = Arrays.stream(dav).mapToInt(abc -> abc.length()).max().orElse(0);
        System.out.println("maxLength: "+maxLength);
    }

}
```

## *MapNdFlatMapEmployeeComparator*
```java
package java8.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapNdFlatMapEmployeeComparator {
    public static void main(String[] args) {
        List<String> empCity = new ArrayList<>();
        empCity.add("Indore");
        empCity.add("Pune");
        empCity.add("Bangalore");
        Employee1 emp = new Employee1(1, "deepak", empCity);

        List<String> emp1City = new ArrayList<>();
        emp1City.add("Indore");
        emp1City.add("Bangalore");
        Employee1 emp1 = new Employee1(2, "deepak", emp1City);

        List<String> emp2City = new ArrayList<>();
        emp2City.add("Pune");
        emp2City.add("Chennai");
        emp2City.add("Bangalore");
        Employee1 emp2 = new Employee1(3, "daram", emp2City);

        List<String> emp3City = new ArrayList<>();
        emp3City.add("Pune");
        emp3City.add("Indore");
        emp3City.add("Bangalore");
        Employee1 emp3 = new Employee1(4, "pradeep", emp3City);

        List<Employee1> empL = Arrays.asList(emp, emp1, emp2, emp3);

        //Todo: Comparator Demo Start
        List<Employee1> descEmpId = empL.stream().sorted((o1, o2) -> (int) (o2.getId() - o1.getId())).collect(Collectors.toList());
        System.out.println("descEmpId: "+descEmpId);
        List<Employee1> top3Id = descEmpId.stream().limit(3).collect(Collectors.toList());
        System.out.println("top3Id: "+top3Id);
        List<Employee1> idLessThen3rdLargest = descEmpId.stream().skip(3).collect(Collectors.toList());
        System.out.println("idLessThen3rdLargest: "+idLessThen3rdLargest);
        //Todo: Comparator Demo End

        //Todo: Map And Flat Map Demo
        // Application of FlatMap: Example here, the cities are in "List of List" format it will look something like [["bhopal","Indore"]]
        // Problem with Normal Map is it cannot work upon 2D List, that's where FlatMap came into picture
        // For here we are going to convert the List of List into a single List
        // Below is Map example
        List<List<String>> listOfCitites = empL.stream().map(empObj -> empObj.getCity()).collect(Collectors.toList());
        System.out.println("listOfCitites: "+listOfCitites);

        //Below is FlatMap example
        /*Set<String> flaMapOfCities = empL.stream().flatMap(empOb -> empOb.getCity().stream()).collect(Collectors.toSet());
        System.out.println("flatMapOfCities: "+flaMapOfCities);*/
        Set<String> flaMapOfCities = empL.stream().flatMap(empOb -> empOb.getCity().stream()).collect(Collectors.toSet());
        System.out.println("flatMapOfCities: "+flaMapOfCities);

        //Map And Flat Map Demo
    }
}
```

## *P1_FindDuplicateElementsUsingStreams*
```java
package java8.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P1_FindDuplicateElementsUsingStreams {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"deepak", 31);
        Employee emp1 = new Employee(2,"deepak",30);
        Employee emp2 = new Employee(3,"daram",25);
        Employee emp3 = new Employee(4,"pradeep",20);
        Employee emp4 = new Employee(5,"debu",25);

        List<Employee> empL = new ArrayList<>();
        empL.add(emp);
        empL.add(emp1);
        empL.add(emp2);
        empL.add(emp3);
        empL.add(emp4);

        //Todo: First Approach
        /*List<String> allNames = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        Set<String> uniqueNames = new HashSet<>();
        Set<String> duplicateElement = allNames.stream().filter(bac -> !uniqueNames.add(bac)).collect(Collectors.toSet());
        System.out.println("duplicateElement: "+duplicateElement);*/

        //Todo: Second Approach
        /*List<String> allNames = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        Map<String, Long> mapNames = allNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> names = mapNames.entrySet().stream().filter(dac -> dac.getValue() > 1).map(dac -> dac.getKey()).collect(Collectors.toList());
        System.out.println("names: "+names);*/

        //Todo: Third approach
        /*List<String> allNames = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        Set<String> names = allNames.stream().filter(fad -> Collections.frequency(allNames, fad) > 1).collect(Collectors.toSet());
        System.out.println("names: "+names);*/

    }
}
```

## *ReverseArrayOfIntegerInPlace*
```java
package java8.programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayOfIntegerInPlace {
    public static void main(String[] args) {
        int[] num ={5,2,6,5,3,4,1};
        reverseArrInPlace(num);
    }
    public static void reverseArrInPlace(int[] abc){
        IntStream.range(0, abc.length/2).forEach(i -> {
            int temp = abc[i];
            abc[i]=abc[abc.length-i-1];
            abc[abc.length-i-1]= temp;
        });
        System.out.println("Reverse Array: "+Arrays.toString(abc));
    }
}
```

## *ScndSmllstElmFrmIntArrNdReduceDemo*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;

public class ScndSmllstElmFrmIntArrNdReduceDemo {
    public static void main(String[] args) {
        int[] num ={5,2,6,5,3,4,1};
        //Code snippet for reduce
        List<Integer> reduceDemo = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("reduceDemo: "+reduceDemo.stream().reduce((a,b)->a+b).get());
        //Code snippet for reduce
        fetchSecSmllstElm(num);
    }
    public static void fetchSecSmllstElm(int[] dac){
        int i = Arrays.stream(dac).distinct().sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Doesn't have second smallest element"));
        System.out.println("Second smallest elememt in the given arr: "+i);
    }
}
```

## *SqrtOf10Prime*
```java
package java8.programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SqrtOf10Prime {
    public static void main(String[] args) {
        List<Double> sqrtOfFirst10PrimeNum = Stream.iterate(1, i -> i + 1)
                .filter(SqrtOf10Prime::isPrime).peek(x -> System.out.print(", "+x))
                .map(Math::sqrt)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(sqrtOfFirst10PrimeNum);


    }

    public static boolean isPrime(int num){
        return num >1&& IntStream.range(2,num).noneMatch(n ->num%n==0);
    }
}
```

## *StngToUprCaseNdJoinWidComa*
```java
package java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StngToUprCaseNdJoinWidComa {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<String> ages = empL.stream().map(abc -> abc.getName()).collect(Collectors.toList());
        String bs = ages.stream().map(bac -> bac.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(bs);
    }
}
```

## *StringReverse*
```java
package java8.programs;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverse {
    public static void main(String[] args) {
        String originalString = "Hello, Java 8!";

        String reversedString1 = reverseWithStringBuilder(originalString);
        System.out.println("Reversed String (StringBuilder): " + reversedString1);
        String reversedString2 = reverseUsingIntStreamRangeMethod(originalString);
        System.out.println("Reversed String (IntStreamRangeMethod): "+reversedString2);
        String reversedString3 = reverseUsingStreamOfMethod(originalString);
        System.out.println("Reversed String (StreamOfMethod): "+reversedString3);
        String reversedString4 = reverseUsingCharsMethod(originalString);
        System.out.println("Reversed String (CharsMethod): "+reversedString4);

    }

    private static String reverseWithStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static String reverseUsingIntStreamRangeMethod(String str) {
        if (str == null) {
            return null;
        }

        char[] charArray = str.toCharArray();
        System.out.println("charArray: "+charArray.toString());
        return IntStream.range(0, str.length())
                .mapToObj(i -> charArray[str.length() - i - 1])
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static String reverseUsingStreamOfMethod(String str) {
        if (str == null) {
            return null;
        }

        return Stream.of(str)
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());
    }

    public static String reverseUsingCharsMethod(String str) {
        if (str == null) {
            return null;
        }

        /*return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (a, b) -> b + a, (a2, b2) -> b2 + a2);*/

//Todo: above method can also be handled in below manner
        Optional<String> reversedOptional = str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce((a, b) -> b + a);

        return reversedOptional.orElse("");
    }

}
```

# <u>Concepts</u>
## *BiPredicateBiFunctionBiConsumer*
```java
package java8.concept;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFunctionBiConsumer {
//Todo:Done
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bipreSumOfTwo = (a,b) -> a+b >5;
        System.out.println("checkSumOfTwo: "+bipreSumOfTwo.test(2,5));

        BiFunction<Integer, Integer, Integer> bifiSumOfTwo = (a, b) -> a+b;
        System.out.println("returnSumOfTwo: "+bifiSumOfTwo.apply(2,5));

        BiConsumer<Integer, Integer> biconSumOfTwo = (a, b) -> {
            int i = a + b;
            System.out.println("TestingBiConsumer: "+i);
        };
        biconSumOfTwo.accept(7,1);
    }
}
```

## *ConsumerDemo*
```java
package java8.concept;

import java.util.function.Consumer;

public class ConsumerDemo {
    //Todo:Done
    //It will take Input but Never returns anything
    //It has two methods, accept() and andThen() for method chaining
    public static void main(String[] args) {
        Consumer<Integer> sqrMe = i -> System.out.println("SqrOutput: "+i*i);
        sqrMe.accept(3);
        Consumer<Integer> doubleMe = i -> System.out.println("DblOutput: "+2*i);
        doubleMe.accept(3);
        sqrMe.andThen(doubleMe).accept(4);
    }
}
```

## *Employee*
```java
package java8.concept;

public class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName(){
        System.out.println("In Emp Class: "+name);
    }

    public void getEmployeeInfo(){
        System.out.println("Method in Employee Class");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

## *EmployeeDo*
```java
package java8.concept;

public class EmployeeDo {
    private int id;
    private String name;
    private int age;

    public EmployeeDo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public EmployeeDo() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName(){
        System.out.println("In Emp Class: "+name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

## *EmployeeManager*
```java
package java8.concept;

public interface EmployeeManager {
    public Employee getEmployee();
}
```

## *EmployeeMapper*
```java
package java8.concept;

public class EmployeeMapper {

    public static EmployeeDo staticEmployeeToEmployeeDo(Employee emp){
        EmployeeDo employeeDo = new EmployeeDo();
        employeeDo.setId(emp.getId());
        employeeDo.setAge(emp.getAge());
        employeeDo.setName(emp.getName());
        return employeeDo;
    }

    public EmployeeDo instanceEmployeeToEmployeeDo(Employee emp){
        EmployeeDo employeeDo = new EmployeeDo();
        employeeDo.setId(emp.getId());
        employeeDo.setAge(emp.getAge());
        employeeDo.setName(emp.getName());
        return employeeDo;
    }
}
```

## *FunctionDemo*
```java
package java8.concept;

import java.util.function.Function;

public class FunctionDemo {
//Todo:Done
    public static void main(String[] args) {
        //Note:- run this program for observation
        //For chaining use: andThen(), compose()

        Function<Integer,Integer> doubleIt = i ->2*i;
        System.out.println("After doubling: "+doubleIt.apply(2));

        Function<Integer,Integer> cubeIt = i ->i*i*i;
        System.out.println("After doubling: "+cubeIt.apply(2));

        System.out.println("First Doubling Using Apply: "+doubleIt.andThen(cubeIt).apply(2));

        System.out.println("First Cubing Using Compose: "+doubleIt.compose(cubeIt).apply(2));
    }
}
```

## *IntermediateOps*
```java
package java8.concept;

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
```

## *MethodNdConstructorReferenceDemo*
```java
package java8.concept;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MethodNdConstructorReferenceDemo {
//Todo:Done
    public static void main(String[] args) {
        /*Todo: Syntax: Object::methodName*/
        MethodNdConstructorReferenceDemo service = new MethodNdConstructorReferenceDemo();

        //Todo: anonymous impl
        service.loadEmployeeFromDb().forEach(new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                System.out.println(employee);
            }
        });

        //Todo: Lambda impl
        service.loadEmployeeFromDb().forEach(employee -> System.out.println(employee));

        //Todo: static method reference start
        // Method reference impl with custom print
        service.loadEmployeeFromDb().forEach(MethodNdConstructorReferenceDemo::print);

        //Todo: Method reference impl with predefined println
        service.loadEmployeeFromDb().forEach(System.out::println);

        //Todo: Another static method reference example
        List<EmployeeDo> employeeDoList = service.loadEmployeeFromDb().stream().map(EmployeeMapper::staticEmployeeToEmployeeDo).collect(Collectors.toList());
        System.out.println(employeeDoList);
        //Todo: static method reference end

        //Todo: instance method reference start
        EmployeeMapper employeeMapper = new EmployeeMapper();
        List<EmployeeDo> instanceEmployeeDoList = service.loadEmployeeFromDb().stream().map(employeeMapper::instanceEmployeeToEmployeeDo).collect(Collectors.toList());
        System.out.println(instanceEmployeeDoList);
        //Todo: instance method reference end

        //Todo: Different UseCase Start
        // In below case getName is not static but we can still call it without using any object reference because method without parameter are treated as static
        // in java 8 so need to use object reference we can call it directly using class name
        List<String> stringName = service.loadEmployeeFromDb().stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(stringName);
        //Todo: Different UseCase End

        //Todo: Constructor reference Start
        // Syntax: constructor :: new
        // using lambda for constructor
        EmployeeManager manager = ()-> new Employee();
        manager.getEmployee().getEmployeeInfo();

        //Todo: using constructor reference for constructor
        EmployeeManager manager1 = Employee::new;
        manager1.getEmployee().getEmployeeInfo();
        //Todo: Constructor reference End

    }

    public static void print(Employee employee){
        System.out.println(employee);
    }

    public List<Employee> loadEmployeeFromDb(){
        return IntStream.rangeClosed(1,10).mapToObj(i -> new Employee(i, "employee"+i, 15+i)).collect(Collectors.toList());
    }

}
```

## *OptionalDemo*
```java
package java8.concept;

import java.util.Optional;

public class OptionalDemo {
//Todo:Done
    public static void main(String[] args) {
//Optional.of(emp);//In case you are sure that the value is not null
//Optional.ofNullable(emp);*///In case you are not sure about value then use this
//optionalEmp.isPresent returns boolean value
//optionalEmp.isPresentOrElse()
//optionalEmp.get() will retrieve the object in case it is present otherwise it will throw error
//optionalEmp.orElse(new Employee(1, name, 31)); This will return the value if it is present otherwise orElse's value
//.get() and .orElseThrow() are same methods
//optionalEmp.orElseGet(Supplier Function)

        Optional<Employee> samEmp = getEmp("sam");
        if (samEmp.isPresent()){
            System.out.println(samEmp.get().getName());
        }else {
            System.out.println(0);
        }
    }
    public static Optional<Employee> getEmp(String name){
        Employee emp = new Employee(1, name, 31);
        return Optional.of(emp);//In case you are sure that the value is not null
        /*return Optional.ofNullable(emp);*///In case you are not sure about value then use this
    }
}
```

## *PredicateDemo*
```java
package java8.concept;

import java.util.function.Predicate;

public class PredicateDemo {
//Todo:Done
    public static void main(String[] args) {
        //For chaining use : and, or and negate
        Predicate<String> checkLength =s ->s.length() >=5;
        System.out.println("The length of string is greater than 5: "+checkLength.test("Deepak"));

        Predicate<String> checkEvenLength =s ->s.length()%2==0;
        System.out.println("The length of string is Even or Not: "+checkEvenLength.test("Swami"));

        System.out.println("with and: "+checkLength.and(checkEvenLength).test("Sagar"));

        System.out.println("with or: "+checkLength.or(checkEvenLength).test("Sagar"));

        System.out.println("with negate: "+checkLength.negate().test("Sagar"));
    }
}
```

## *SliceAStream*
```java
package java8.concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SliceAStream {
//Todo:Done
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<Integer> ages = empL.stream().map(abc -> abc.getAge()).collect(Collectors.toList());
        //Say you wanted to find 2nd and 3rd youngest employee age
        //Then you can slice the stream in order to get result using skip() and limit()
        List<Integer> ScndNdThrdYngstEmply = ages.stream().sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(ScndNdThrdYngstEmply);
    }
}
```

## *SummaryStaticsDemo*
```java
package java8.concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStaticsDemo {
//Todo:Done
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);

//Summary statics works on IntStream only not on every stream so you have to use mapToInt() in order to get the IntStream.
//SummaryStatics can be used To calculate getMin(), getMax(), getSum() or getAverage()
        List<Integer> ages = empL.stream().map(abc -> abc.getAge()).collect(Collectors.toList());
        long max = ages.stream().mapToInt(x -> x).summaryStatistics().getSum();
        System.out.println(max);
    }
}
```

## *SupplierDemo*
```java
package java8.concept;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
//Todo:Done
    public static void main(String[] args) {
        //It always returns but never accepts
        Supplier<Date> spl = () -> new Date();
        System.out.println("Current Date: "+spl.get());

        Supplier<Integer> spl1 = () -> 2+2;
        System.out.println("Result: "+spl1.get());

    }
}
```

## *TerminalOps*
```java
package java8.concept;

import java.util.Arrays;
import java.util.List;

public class TerminalOps {
//Todo:Done
    public static void main(String[] args) {
        Employee emp = new Employee(1, "deepak", 31);
        Employee emp1 = new Employee(2, "deepak", 30);
        Employee emp2 = new Employee(3, "daram", 25);
        Employee emp3 = new Employee(4, "pradeep", 20);
        Employee emp4 = new Employee(5, "debu", 15);

        List<Employee> empL = Arrays.asList(emp, emp1, emp2, emp3, emp4);
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
//Terminal operations: forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny()
//Terminal Operators are Eager loaded and they can't be chained together like Intermediate operator and
//Terminal Op. should be used at end only.
//Intermediate operators are lazy loaded
//You won't get any output from this as it is lazy loaded and to get output we do have to use terminal operator in the end.
//In Terminal Operators there are short circuit operators as well like: findFirst(), findAny(), anyMatch(), allMatch(), noneMatch()
        empL.stream().filter(abc ->abc.getAge()%2==0).map(dac -> {
            dac.printName();
            return dac.getName();
        });

//Same as above operation but with terminal operator to get the output
        /*empL.stream().filter(abc ->abc.getAge()%2==0).map(dac -> {
            dac.printName();
            return dac.getName();
        }).forEach(dac -> System.out.println("At Last: "+dac));*/
    }
}
```

# <u>ComparatorSample1</u>
## *Student*
```java
package java8.comparatorsample1;

public class Student {
    private Integer age;
    private String name;
    private String address;

    public Student() {
    }

    public Student(Integer age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
```

## *StudentComparator*
```java
package java8.comparatorsample1;

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
```