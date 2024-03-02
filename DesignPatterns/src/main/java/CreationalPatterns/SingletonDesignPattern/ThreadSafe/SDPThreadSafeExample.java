package CreationalPatterns.SingletonDesignPattern.ThreadSafe;

public class SDPThreadSafeExample {
    public static void main(String[] args) {
        SDPThreadSafe s1 = SDPThreadSafe.getSDPThreadSafe();
        System.out.println(s1.hashCode());
        SDPThreadSafe s2 = SDPThreadSafe.getSDPThreadSafe();
        System.out.println(s2.hashCode());
    }
}