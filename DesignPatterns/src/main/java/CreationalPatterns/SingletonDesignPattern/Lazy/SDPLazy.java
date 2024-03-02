package CreationalPatterns.SingletonDesignPattern.Lazy;

public class SDPLazy{
    //Lazy initialization
    private static SDPLazy samosa;

    private SDPLazy(){

    }

    public static SDPLazy getSDPLazy(){
        if (samosa==null){
            samosa = new SDPLazy();
        }
        return samosa;
    }
}