import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu indexul pentru linii: ");
        int n = scanner.nextInt();
        System.out.println("Introdu indexul pentru coloane: ");
        int m = scanner.nextInt();

        int[][] x = new int[n][m];
//      se introduc datele matricei pe fiecare linie si cu trecere pe urmatoarea coloana
//      pana la indecsii n si m de la consola x[i][j] = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
//      se afiseaza matricea parcurgand fiecare linie i cu trecere pe urmatoarea coloana j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matricea inversata - linii cu coloanele este: x[j][i]");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("\nElementele diagonalei principale sunt: ");
        //elementele de pe diagonala principala
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j]) {
                    System.out.print(x[i][j] + " ");
                }
            }
        }
        System.out.println("\nElementele diagonalei secundare sunt: ");
        //elementele de pe diagonala secundara
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i + j == n - 1) {
                    System.out.print(x[i][j] + " ");
                }
            }
        }
        System.out.println("\nElementele de sub diagonala principala sunt: ");
        //elementele de sub diagonala principala
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i > j) {
                    System.out.print(x[i][j] + " ");
                }
            }
        }
        System.out.println("\nElementele de deasupra diagonalei principale sunt: ");
        //elementele de deasupra diagonalei principale
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (i < j) {
                    System.out.print(x[i][j] + " ");
                }
            }
        }
        System.out.println("\nElementele de deasupra diagonalei secundara sunt: ");
        int zarr = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i + j < n - 1) {
                    zarr = x[i][j];
                    System.out.print(zarr + " ");
                    //elementele de sub diagonala secundare
                } else if (i + j >= n) {
                    zarr = x[i][j];
                    System.out.print(" " + zarr + " ");
                }
            }
        }


    }

}
