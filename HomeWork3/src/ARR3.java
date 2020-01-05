// Scrieti o metoda ce primeste ca parametrii 2 array-uri de tip int si returneaza un array
// cu toate elementele din cele 2 array-uri.
// Sau mai pe scurt o metoda ce concateneaza 2 array-uri.

import java.util.Scanner;

public class ARR3 {

    private static void concatenate(int n, int m) {
        Scanner s = new Scanner(System.in);
        System.out.println("Index value of array 1 is: " + n);
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Index value of array 2 is: " + m);
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
           System.out.print(a[i] + " ");
        }
        for (int i = 0; i < m; i++){
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        concatenate(3,4);

    }

}