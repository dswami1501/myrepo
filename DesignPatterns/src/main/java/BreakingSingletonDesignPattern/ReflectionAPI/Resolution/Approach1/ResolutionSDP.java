package BreakingSingletonDesignPattern.ReflectionAPI.Resolution.Approach1;

public class ResolutionSDP{
    //Lazy initialization
    private static ResolutionSDP samosa;

    private ResolutionSDP(){
        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton");
        }
    }

    public static ResolutionSDP getSamosa(){
        if (samosa==null){
            samosa = new ResolutionSDP();
        }
        return samosa;
    }
}