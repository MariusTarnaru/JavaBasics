package Recursion;

import java.util.Scanner;

public class FactorialOfN {

    private static long recursion1(int n){
        while (n > 1){
            return (n-1)*n;
        }
        return n;
    }
    private static int recursion2(int n){
        if (n == 1)
            return 1;
        return (n - 1) * n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul N pentru a afla N!: ");
        int number = scanner.nextInt();

            long factorial1 = (long)recursion1(number);
            System.out.println("Valoarea N! pentru numarul " + number +  ", este: \n" + factorial1 );

            int factorial2 = recursion2(number);
        System.out.println("Valoarea N! pentru numarul " + number +  ", este: \n" + factorial2 );

    }
}
