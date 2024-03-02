package BreakingSingletonDesignPattern.SerializationDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakingSDPSerializationExample {
    public static void main(String[] args) throws Exception{
        BreakingSDPSerialization s1 = BreakingSDPSerialization.getSamosa();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.ob"));
        oos.writeObject(s1);
        System.out.println(s1.hashCode());
        System.out.println("Serialization done!");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ob"));
        BreakingSDPSerialization s2 = (BreakingSDPSerialization)ois.readObject();
        System.out.println(s2.hashCode());
    }
}