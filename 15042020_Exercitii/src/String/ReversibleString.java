package String;

import java.util.Scanner;

public class ReversibleString {
    //check if a string is perfect reversible or not

    public static void main(String[] args) {
        if (isReversible(myString()))
        System.out.println("String is reversible !");
        else
            System.out.println("String is not reversible !");
    }

    private static boolean isReversible(String myString){
        int i = 0, j = myString.length()-1;

        while (i < j){
            if (myString.charAt(i) != myString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    private static String myString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write any string: ");
        String string = scanner.nextLine();
        return string;
    }
}
