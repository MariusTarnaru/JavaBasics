//cititi doua numere de la consola.
//afisati un numar de simboluri egal cu diferenta absoluta dintre ele.

import java.util.Scanner;

public class AbsoluteDivision {
    public static void character() {
        System.out.print("#");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the 1st number: ");
        int n1 = s.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int n2 = s.nextInt();
        int dif = n1 - n2;
        if (dif < 0) {
            dif = dif * (-1);
        }
        for (int i = 0; i < dif; i++) {
            character();
        }
        System.out.println();

//cititi doua numere de la consola (n si m)
//daca n se imparte la m afisati suma numerelor de la m la n
//daca n nu se imparte la m afisati suma numerelor de la 0 la restul impartirii lui n la m
        System.out.println("Please enter the 1st number: ");
        int n = s.nextInt();
        System.out.println("Please enter the 2nd number: ");
        int m = s.nextInt();
        int sum = 0;
        if (n % m == 0 && n > m) {
            System.out.print("Sum of numbers from m to n value is : ");
            for (int i = m; i <= n; i++) {
                sum = n + i;
            }
            System.out.print(sum + " ");

        } else {
            if (n % m != 0 && n > m) {
                int rest;
                rest = n % m;
                System.out.println(rest);
                System.out.print("Sum of numbers from 0 to the rest of the division is : ");
                for (int i = 0; i <= rest; i++) {
                    sum = sum + i;
                }
                System.out.print(sum + " ");
            }
        }

    }
}