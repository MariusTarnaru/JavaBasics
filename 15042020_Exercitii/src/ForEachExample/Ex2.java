package ForEachExample;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
//Se citeşte un număr n care reprezintă lungimea unui vector. Creaţi vectorul de lungime n,
// puneţi valori aleatoare pe fiecare poziţie (între 1 şi 100) şi afişaţi vectorul.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write one number for dimension of your array: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n ; i++) {
            int number = (int)(Math.random()*100) + 1;
            myArray[i] = number;
        }
        System.out.println("My random array is:");
        for (int number : myArray ) {
            System.out.print(" " + number);
        }
    }
}
