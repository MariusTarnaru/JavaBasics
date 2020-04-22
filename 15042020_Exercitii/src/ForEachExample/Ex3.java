package ForEachExample;

import java.util.Scanner;

public class Ex3 {
    //Creaţi un vector care reţine 1000 de valori. Puneţi în el valori aleatoare între 10 şi 99.
    // Afişaţi vectorul, apoi afişaţi de câte ori apar numere cu 0 în coadă (ex: 10, 20, 30, etc…).

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number for dimension af your array: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            int randomNumber = (int)(Math.random() * 89) + 10;
            myArray[i] = randomNumber;
        }
        System.out.println("Your random array with numbers from 10 to 99 is: ");
        for (int number : myArray ) {
            System.out.print(" " + number);
        }
        System.out.println();
        System.out.println("Numbers divided by 10 are: ");
        for (int number : myArray) {
            if (number % 10 == 0){
                System.out.print(" " + number);
                count++;
            }
        }
        System.out.println("\nNumbers divided by 10 is repeated from: " + count + "  " +
                "times");

    }
}
