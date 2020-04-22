package Array;

//Creează un array care să conţină mai multe nume de persoane.
//Afişează-l folosind un for.

public class arrayOfStrings {

    public static void main(String[] args) {

        String [] someNames = {"Maria", "Marius", "Vasile", "Ionela", "Ioan"};
        for (int i = 0; i < someNames.length; i++) {
            System.out.println("Name from index " + i + " is: " + someNames[i]);
        }
    }

}
