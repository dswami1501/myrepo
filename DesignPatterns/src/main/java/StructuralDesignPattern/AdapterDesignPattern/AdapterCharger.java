package StructuralDesignPattern.AdapterDesignPattern;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger charger;

    public AdapterCharger(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void chargeIphone() {
        charger.chargeAnroidPhone();
        System.out.println("Using Adapter cable");
    }
}
