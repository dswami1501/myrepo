package CreationalPatterns.AbstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.name()+" hahaha and salary is: "+employee.salary());
        Employee employee1 = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println(employee1.name()+" hahaha and salary is: "+employee1.salary());
    }
}
