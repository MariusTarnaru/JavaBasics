import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        Person Mike = new Person("Mike", 32);
        Person person1 = new Person("Julia", 27);
        System.out.println(Mike);
        System.out.println(person1);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.ser");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(Mike);
            objectOutputStream.writeObject(person1);
            objectOutputStream.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
