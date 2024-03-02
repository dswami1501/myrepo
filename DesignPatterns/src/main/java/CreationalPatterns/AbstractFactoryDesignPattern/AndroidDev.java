package CreationalPatterns.AbstractFactoryDesignPattern;

public class AndroidDev implements Employee{
    @Override
    public String name() {
        return "I am android dev";
    }

    @Override
    public int salary() {
        return 50000;
    }
}
