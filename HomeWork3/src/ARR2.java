import java.util.Scanner;

public class ARR2 {

    public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void showMinValue(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                System.out.println("min value is " + min);
            }
        }
    }

    public static void showMinValueIndex(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
               int minIndex = i;
                System.out.println("min value at index: " + minIndex);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        showArray(a);
        showMinValue(a);
        showMinValueIndex(a);

    }
}


