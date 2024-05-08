package SerializationDeserializationExternalization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("raku.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee employee = (Employee) ois.readObject();
        System.out.println(employee);
        ois.close();
        fis.close();
    }
}
