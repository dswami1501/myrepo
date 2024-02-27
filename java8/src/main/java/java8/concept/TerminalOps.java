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
