package SerializationDeserializationExternalization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e = new Employee(2, "Rajesh");
        FileOutputStream fos = new FileOutputStream("raku.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.close();
        fos.close();
    }
}
