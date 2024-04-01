package java8.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(4);
        //Todo: with predefined Collections's sort method: Start
        /*Collections.sort(ls);
        System.out.println(ls);*/
        //with predefined Collections's sort method: End
        //Todo: Now using Comparator with
        //*Separate Class
        //*Anonymous implementation
        //*Using Lambda
        //*Using Streams and lambda
        //*Using Streams and method reference

        //Todo: *Separate Class:Start
        List<Employee> employees = EmployeeDB.getEmployee(10);
        /*Collections.sort(employees,new MyComp());
        System.out.println(employees);*/
        //*Separate Class: End

        //Todo: *Anonymous implementation:Start
        /*Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getId()>o1.getId()?1:-1;//Descending order
            }
        });
        System.out.println(employees);*/
        //*Anonymous implementation: End

        //*Todo: Using Lambda: Start
        /*Collections.sort(employees,(o1, o2) -> o2.getId()>o1.getId()?1:-1);
        System.out.println(employees);*/
        //*Using Lambda: End

        //Todo: *Using Streams and lambda:Start
        /*employees.stream().sorted(Comparator.comparing(e -> e.getId())).forEach(System.out::println);*///ascending order
        /*employees.stream().sorted((o1, o2) -> o2.getId()>o1.getId()?1:-1).forEach(System.out::println);*///descending order
        //*Using Streams and lambda: End

        //*Todo: Using Streams and method reference: Start
        /*employees.stream().sorted(Comparator.comparing(Employee::getId).reversed()).forEach(System.out::println);*///Used method reference
        // and reversed it to get descending order
        //*Using Streams and method reference: End
    }
}

class MyComp implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getId()>o1.getId()?1:-1;//Descending order
    }
}
