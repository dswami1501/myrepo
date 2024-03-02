package BreakingSingletonDesignPattern.Cloneing.Resolution;

public class ResolutionSDPClone implements Cloneable{
    //Lazy initialization
    private static ResolutionSDPClone samosa;

    private ResolutionSDPClone(){
    }

    public static ResolutionSDPClone getSamosa(){
        if (samosa==null){
            samosa = new ResolutionSDPClone();
        }
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }
}