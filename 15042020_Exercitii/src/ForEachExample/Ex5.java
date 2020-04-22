package ForEachExample;

import java.util.Scanner;
//Creaţi un array de String ce conţine iniţializări pentru elemente la declarare. Afişaţi vectorul.

public class Ex5 {

    public static void main(String[] args) {
        String[] myString ={"Marius", "Ionut", "Vlad", "Georgiana", "Costel"};
        System.out.println("Strings from array are: ");
        for (String names: myString ) {
            System.out.print(names + " ");
        }
    }

}