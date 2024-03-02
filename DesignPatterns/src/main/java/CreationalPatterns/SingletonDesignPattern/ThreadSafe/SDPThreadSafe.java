package CreationalPatterns.SingletonDesignPattern.ThreadSafe;

public class SDPThreadSafe{
    //Lazy initialization
    private static SDPThreadSafe samosa;

    private SDPThreadSafe(){

    }

    public static SDPThreadSafe getSDPThreadSafe(){
        if (samosa==null){
            synchronized (SDPThreadSafe.class){
                if (samosa==null){
                    samosa = new SDPThreadSafe();
                }
            }
        }
        return samosa;
    }
}