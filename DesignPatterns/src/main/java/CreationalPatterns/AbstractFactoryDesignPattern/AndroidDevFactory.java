package CreationalPatterns.AbstractFactoryDesignPattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDev();
    }
}
