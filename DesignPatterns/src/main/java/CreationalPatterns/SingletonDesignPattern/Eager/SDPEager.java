package CreationalPatterns.SingletonDesignPattern.Eager;

public class SDPEager {
    //Eager Initialiazation
    //Disadvantage: object get automatically initialized whether or not client is using it.
    private static SDPEager jalebi =new SDPEager();

    public static SDPEager getSDPEager() {
        return jalebi;
    }
}