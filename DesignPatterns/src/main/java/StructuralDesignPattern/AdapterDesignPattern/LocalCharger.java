package StructuralDesignPattern.AdapterDesignPattern;

public class LocalCharger implements AndroidCharger{
    @Override
    public void chargeAnroidPhone() {
        System.out.println("Android is charging");
    }
}
