package CreationalPatterns.SingletonDesignPattern.Lazy;

public class SDPLazyExample {
    public static void main(String[] args) {
        SDPLazy s1 = SDPLazy.getSDPLazy();
        System.out.println(s1.hashCode());
        SDPLazy s2 = SDPLazy.getSDPLazy();
        System.out.println(s2.hashCode());
    }
}