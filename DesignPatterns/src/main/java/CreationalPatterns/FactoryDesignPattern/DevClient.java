package CreationalPatterns.FactoryDesignPattern;

public class DevClient {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("Web Dev");
        System.out.println(emp.salary());
        Employee emp1 = EmployeeFactory.getEmployee("Android Dev ");
        System.out.println(emp1.salary());
    }
}
