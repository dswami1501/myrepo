package SerializationDeserializationExternalization;

import java.io.*;

public class ExternalizationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee1 e = new Employee1();
        e.setId(1);
        e.setName("Deepak");
        FileOutputStream fos = new FileOutputStream("external.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("external.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee1 employee = (Employee1) ois.readObject();
        System.out.println(employee);
        ois.close();
        fis.close();
    }
}
