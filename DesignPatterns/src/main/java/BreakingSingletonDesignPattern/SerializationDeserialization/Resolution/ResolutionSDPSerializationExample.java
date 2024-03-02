package BreakingSingletonDesignPattern.SerializationDeserialization.Resolution;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ResolutionSDPSerializationExample {
    public static void main(String[] args) throws Exception{
        ResolutionSDPSerialization s1 = ResolutionSDPSerialization.getSamosa();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ob"));
        oos.writeObject(s1);
        System.out.println(s1.hashCode());
        System.out.println("Serialization done!");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ob"));
        ResolutionSDPSerialization s2 = (ResolutionSDPSerialization)ois.readObject();
        System.out.println(s2.hashCode());
    }
}