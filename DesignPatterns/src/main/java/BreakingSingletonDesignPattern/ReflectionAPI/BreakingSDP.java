package BreakingSingletonDesignPattern.ReflectionAPI;
public class BreakingSDP{
    //Lazy initialization
    private static BreakingSDP samosa;

    private BreakingSDP(){

    }

    public static BreakingSDP getBreakingSDP(){
        if (samosa==null){
            samosa = new BreakingSDP();
        }
        return samosa;
    }
}