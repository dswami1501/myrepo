package com.java8.java8.java8.concept;

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
