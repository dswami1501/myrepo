package CreationalPatterns.AbstractFactoryDesignPattern;

public class WebDev implements Employee{
    @Override
    public String name() {
        return "I am Web Dev";
    }

    @Override
    public int salary() {
        return 80000;
    }
}
