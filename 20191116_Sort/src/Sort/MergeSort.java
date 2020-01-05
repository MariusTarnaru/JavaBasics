package Sort;

import java.util.Scanner;

public class MergeSort {


    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;  // find the middle of arr
            sort(arr, l, m);  //sort first half
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int nl = m - l + 1; // index of subarray left
        int nr = r - m;     //index of subarray right

        //Create temp arrays
        int L[] = new int[nl];  //array from left
        int R[] = new int[nr];  //array from right

//Copy data to temp arrays
        for (int i = 0; i < nl; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < nr; ++j)
            R[j] = arr[m + 1 + j];

// Merge the temp arrays
        // Initial indexes of first and second subarrays
        int il = 0, ir = 0;
        int iarr = l;

        while (il < nl && ir < nr) {
            if (L[il] <= R[ir]) {
                arr[iarr] = L[il];
                il++;
            } else {
                arr[iarr] = R[ir];
                ir++;
            }
            iarr++;
        }

        while (il < nl) {
            arr[iarr] = L[il];
            il++;
            iarr++;
        }

        while (ir < nr) {
            arr[iarr] = R[ir];
            ir++;
            iarr++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, 72, 11, 42, 35, 67, 29, 5};
        System.out.println("Array is: ");
        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);
        showArray(arr);

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        showArray(array);
        ms.sort(array, 0 , array.length - 1);
        showArray(array);


    }
}
