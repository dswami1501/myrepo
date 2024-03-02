package CreationalPatterns.AbstractFactoryDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDev();
    }
}
