package StructuralDesignPattern.AdapterDesignPattern;

public class Charger implements AppleCharger{
    @Override
    public void chargeIphone() {
        System.out.println("I phone is charging");
    }
}
