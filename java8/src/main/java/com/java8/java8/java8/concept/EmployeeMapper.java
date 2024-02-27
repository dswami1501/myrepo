package com.java8.java8.java8.concept;

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
