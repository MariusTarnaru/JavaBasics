import java.util.Scanner;


public class Array {
    static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti indexul arrayului: ");
        int n = s.nextInt();
        int l = s.nextInt();
        int[] arr = new int[n];
        int[] b = {34, 11, 65, 23, 87, 3, 90};
        int[][] mx = {{3, 5, 8},{7, 5, 32}};
        int[][] m1 = new int[l][l];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length ; j++) {
                m1[i][j] = s.nextInt();
            }
        }

        showArray(arr);
        showArray(b);
        showMatrix(mx);
        System.out.println(mx[0].length);
        showMatrix(m1);

    }
}
