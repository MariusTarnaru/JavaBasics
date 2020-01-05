import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        String s1 = "abcdef ghe FGHIJKL ! ?123456789";
        String s2 = "Bine ca Stringurile nu sunt f0art3 gr3l3 !!";
        String[] names = {"Marius", "John", "Ella"};
        System.out.print("Enter a string : ");
        Scanner s = new Scanner(System.in);
        String inputString = s.nextLine();
        System.out.println("String read from console is : \n" + inputString);
        System.out.println(inputString.concat(" " + s1).toLowerCase());
        String s3 = inputString + s1;
        System.out.println(s3.replace("a", "A"));
        System.out.println(s3.length());

        String out = "";
        for (int i = 0; i < s3.length(); i++) {
            out = s3.charAt(i) + out;
            System.out.println("String reverse is: " + out);
        }
        String altout = "";
       /* for (int i = 0; i < s2.length(); i++) {
            altout = altout + s2.charAt(i);
            System.out.println("String de la inceput: " + altout);
        }*/
        String nameString = inputString + " " + names[1];
        System.out.println(nameString);
        nameString = nameString.replace("u", "Q");
        System.out.println(nameString);


    }
}
