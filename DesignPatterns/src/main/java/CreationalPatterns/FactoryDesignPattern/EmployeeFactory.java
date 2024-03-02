package CreationalPatterns.FactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String emp){
        if (emp.trim().equalsIgnoreCase("Android Dev")){
            return new AndroidDev();
        }else if(emp.trim().equalsIgnoreCase("Web Dev")){
            return new WebDev();
        }else {
            return null;
        }
    }
}
