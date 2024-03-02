package CreationalPatterns.FactoryDesignPattern;

public class WebDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Web Dev salary");
        return 50000;
    }
}
