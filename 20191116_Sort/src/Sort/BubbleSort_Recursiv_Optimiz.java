package Sort;

import javax.swing.*;
import java.util.Scanner;

public class BubbleSort_Recursiv_Optimiz {

    public static void showArray(int[] a, String message) {
        System.out.println(message + " ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    //swap array[j+1] and array[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        // Citeste dimensiunea array-ului
        System.out.println("How big should the array be?");
        int n = scanner.nextInt();
        //citeste elementele array-ului
        System.out.println();
        System.out.println("Type in " + n + " elements:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
//        int[] array = readArray();
//        showArray(array, "array1");
//        bubbleSort(array);
//        showArray(array, "array1");

        int[] array2 = readArray();
        showArray(array2, "array2");
        recursiveBubbleSort(array2, array2.length);
        showArray(array2, "array2");
    }

    //o metoda pentru recursivitate in cazul Bubble Sort
    public static void recursiveBubbleSort(int[] array, int n) {
        //conditie de oprire
        if (n == 1) {
            return;
        }
        boolean swap = false;
        //parcurgere si scoatere, elementul cel mai mare la sfarsit
        for (int j = 0; j < n - 1; j++) {
            if (array[j] > array[j + 1]) {
                //swap array[j+1] and array[i]
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swap = true;
            }
        }
        //apel recursiv
       if (swap) {
        showArray(array, "executie cu n=" + n);
        recursiveBubbleSort(array, n - 1);
        } else {
            return;
        }
    }
}
