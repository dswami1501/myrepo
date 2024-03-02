package CreationalPatterns.FactoryDesignPattern;

public class AndroidDev implements Employee{
    @Override
    public int salary() {
        System.out.println("Android dev salary");
        return 30000;
    }
}
