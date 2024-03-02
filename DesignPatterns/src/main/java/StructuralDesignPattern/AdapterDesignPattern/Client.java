package StructuralDesignPattern.AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        AppleCharger appleCharger = new AdapterCharger(new LocalCharger());
        Iphone iphone = new Iphone(appleCharger);
        iphone.chargeIphone();
    }
}
