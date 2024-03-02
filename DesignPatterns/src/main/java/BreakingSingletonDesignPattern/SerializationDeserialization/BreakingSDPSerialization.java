package BreakingSingletonDesignPattern.SerializationDeserialization;

import java.io.Serializable;

public class BreakingSDPSerialization implements Serializable{
    //Lazy initialization
    private static BreakingSDPSerialization samosa;

    private BreakingSDPSerialization(){

    }

    public static BreakingSDPSerialization getSamosa(){
        if (samosa==null){
            samosa = new BreakingSDPSerialization();
        }
        return samosa;
    }
}