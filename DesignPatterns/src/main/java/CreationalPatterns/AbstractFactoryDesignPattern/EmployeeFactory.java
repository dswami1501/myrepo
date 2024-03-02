package CreationalPatterns.AbstractFactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory empFac){
        return empFac.createEmployee();
    }
}
