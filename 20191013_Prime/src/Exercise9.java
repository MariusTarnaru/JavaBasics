import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

//cititi doua numere de la consola (n si m)
//daca n este mai mare decat m afisati numerele de la m la n crescator
//daca m este mai mare decat n afisati numerele de la m la n descrescator
        Scanner s = new Scanner(System.in);
        System.out.println("Insert 1st number: ");
        int n = s.nextInt();
        System.out.println("Instert 2nd number: ");
        int m = s.nextInt();

        if (n > m) {
            System.out.println("Numerele crescatoare sunt: ");
            for (int i = m; i < n; i++) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("Numerele descrescatoare sunt: ");
            for (int i = m; i > n; i--) {
                System.out.print(" " + i);
            }

        }
        System.out.println();
// cititi, pe rand, 3 numere de la consola.
//afisati la final cate dintre ele se impart la 2

        Scanner p = new Scanner(System.in);
        System.out.println("Insert 1st number: ");
        int n1 = p.nextInt();
        System.out.println("Insert 2nt number: ");
        int n2 = p.nextInt();
        System.out.println("Insert 3rd number: ");
        int n3 = p.nextInt();
            if (n1 % 2 == 0) {
            System.out.print(n1 + " ");
        }
            if (n2 % 2 == 0) {
            System.out.print(n2 + " ");
        }
            if (n3 % 2 == 0) {
            System.out.print(n3 + " Se impart la 2 !");
        }
        System.out.println();
//ititi, pe rand, 3 numere de la consola.
//la final, afisati media lor - folositi double
        Scanner t = new Scanner(System.in);
        System.out.print("Insert 1st number: ");
        int m1 = t.nextInt();
        System.out.print("Insert 1nt number: ");
        int m2 = t.nextInt();
        System.out.print("Insert 3rd number: ");
        int m3 = t.nextInt();
        double med = (m1+m2+m3)/2;
        System.out.println("Media celor trei numere este: " + med);


      /*  int n = 3;
        double avg = 0;
      //  int sum = 0;
        for (int i = 0; i < n; i++){
            int number = scanner.nextInt();
            avg = avg + number;
        }
            avg = avg / n;
       // sum = (double)sum / n;
        System.out.println("Media celor 3 numere este" + avg);   */

    }
}
