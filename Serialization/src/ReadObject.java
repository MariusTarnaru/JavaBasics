import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {
        System.out.println("Reading an object: ");

        try {
            FileInputStream fileInputStream = new FileInputStream("person.ser");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
           // Person person3 = (Person) objectInputStream.readObject();

            objectInputStream.close();
            System.out.println(person1);
            System.out.println(person2);
            // System.out.println(person3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
