package Sort;

import java.util.Scanner;

public class MergeSortTest {

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array, int L, int R) {
        if (L < R) {
            int M = (L + R) / 2;
            sort(array, L, M);
            sort(array, M + 1, R);
            merge(array, L, M, R);
        }
    }

    public static void merge(int[] array, int l, int m, int r) {
        int NL = m - l + 1;  // lungime sir din stanga lui M (Middle)
        int NR = r - m;      // lungime sir din stanga lui M

        // copy elements from Left subaray and Right subarray
        int L[] = new int[NL];
        int[] R = new int[NR];
        // copy data to subarrays
        for (int i = 0; i < NL; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < NR; j++) {
            R[j] = array[m + 1 + j];
        }
        //reimparte cele doua subarayuri
        int iL = 0, iR = 0;
        int iarr = l;
        while (iL < NL && iR < NR) {
            if (L[iL] <= R[iR]) {
                array[iarr] = L[iL];
                iL++;
            } else {
                array[iarr] = R[iR];
                iR++;
            }
            iarr++;
        }
        while (iL < NL) {
            array[iarr] = L[iL];
            iL++;
            iarr++;
        }
        while (iR < NR) {
            array[iarr] = R[iR];
            iR++;
            iarr++;
        }

    }

    public static void main(String[] args) {
        int[] arraay = {3, 7, 0, 9, 1, 2, 6, 5, 4};
        showArray(arraay);
        sort(arraay, 0, arraay.length - 1);
        showArray(arraay);

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        showArray(arr);
        sort(arr, 0 , arr.length- 1);
        showArray(arr);
    }

}
