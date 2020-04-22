package String;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Introduceti doua siruri de caractere: ");
        //firstExample();
        //secondExample();
        //thirdExample();
        fourthExample();

    }
    public static String myScanner(){
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        return myString;
    }

    private static void firstExample () {
        //Să se citească un şir de caractere de la tastatură.
        //Să se afişeze caracterul de pe prima poziţie şi de pe ultima poziţie.
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        char ultimulChar = myString.charAt(myString.length() - 1);
        System.out.println("Primul caracter din sir este: " + myString.charAt(0) +
                " iar ultimul caracter este: " + ultimulChar);
    }
    private static void secondExample() {
        //Se citeşte un şir de caractere de la tastatură. Să se afişeze
        //indexul caracterului 'a'. Ce se va afişa dacă şirul introdus nu conţine caracterul 'a'?
        String myString  = myScanner();
        int indexOfChar_a = myString.lastIndexOf('a');
        if (indexOfChar_a == -1){
            System.out.println("Nu exista caracterul ' a ' in sirul introdus ");
        }
        System.out.println("Indexul caracterului ' a ' introdus de la tastatura este: " +
                indexOfChar_a);
    }
    private static void thirdExample() {
        //Să se concateneze 2 şiruri de caractere citite de la tastatură şi să se afişeze rezultatul.
        //Ce opţiuni aveţi? // doua metode : una folosind concat si a doua folosind
        // myString1 + myString2
        String myString1  =  myScanner();
        String myString2 = myScanner();
        System.out.println("Cele doua siruri concatenate sunt: " + myString1.concat(myString2));
    }
    private  static void fourthExample(){
        //Se citesc 2 şiruri de caractere de la tastatură.
        // Să se afişeze dacă acestea sunt sau nu egale.
        String myString1 = myScanner();
        String myString2 = myScanner();
        if (myString1.equalsIgnoreCase(myString2)) {
            System.out.println("Cele doua siruri introduse sunt identice !!");
        }else {
            System.out.println("Cele doua siruri introduse nu sunt identice !!?!!");
        }
    }


}
