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