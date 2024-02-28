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