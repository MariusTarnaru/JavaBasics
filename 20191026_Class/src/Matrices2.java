import java.util.Scanner;

public class Matrices2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
//        afisati matricea patratica
        System.out.println("Matricea patratica este: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();       // spatiu dupa fiecare linie de n elemente
        }
        System.out.println();
//        afisati elementele de pe diagonala principala
        System.out.println("Elementele de pe diagonala principala sunt: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
//      afisati elementele de pe diagonala secundara
        System.out.println("Elementele de pe diagonala secundara sunt: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i][n - 1 - i] + " ");
        }
        System.out.println();
        System.out.println("Elementele de pe prima linie sunt: ");
//        afisati elementele de pe prima linie
        for (int i = 0; i < n; i++) {
            System.out.print(a[0][i] + " ");
        }
//        Afisati elementele de deasupra diagonalei principale.


    }
}
