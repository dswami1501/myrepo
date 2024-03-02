package BreakingSingletonDesignPattern.Cloneing;

public class BreakingSDPClone implements Cloneable{
    //Lazy initialization
    private static BreakingSDPClone samosa;

    private BreakingSDPClone(){
    }

    public static BreakingSDPClone getSamosa(){
        if (samosa==null){
            samosa = new BreakingSDPClone();
        }
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}