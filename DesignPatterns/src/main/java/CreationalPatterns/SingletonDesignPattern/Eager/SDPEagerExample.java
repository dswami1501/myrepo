package CreationalPatterns.SingletonDesignPattern.Eager;

public class SDPEagerExample {
    public static void main(String[] args) {
        SDPEager j1 = SDPEager.getSDPEager();
        System.out.println(j1.hashCode());
        SDPEager j2 = SDPEager.getSDPEager();
        System.out.println(j2.hashCode());
    }
}