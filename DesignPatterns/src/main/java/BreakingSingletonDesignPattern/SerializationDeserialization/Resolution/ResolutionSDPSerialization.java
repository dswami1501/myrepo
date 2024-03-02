package BreakingSingletonDesignPattern.SerializationDeserialization.Resolution;

import java.io.Serializable;

public class ResolutionSDPSerialization implements Serializable{
    //Lazy initialization
    private static ResolutionSDPSerialization samosa;

    private ResolutionSDPSerialization(){

    }

    public static ResolutionSDPSerialization getSamosa(){
        if (samosa==null){
            samosa = new ResolutionSDPSerialization();
        }
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }
}