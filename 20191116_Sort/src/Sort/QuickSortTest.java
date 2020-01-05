package Sort;

import java.util.Scanner;

public class QuickSortTest {

    public static void quickSort(int[] array, int L, int R) {
        if (L < R) {
            int pivot = partition(array, L, R);
            quickSort(array, 0, pivot - 1);
            quickSort(array, pivot + 1, R);
        }
    }

    public static int partition(int[] array, int L, int R) {
        int pivotValue = array[R];
        int pivotIdx = L - 1;

        for (int j = L; j < R; j++) {
            if (array[j] < pivotValue) {
                pivotIdx++;
                int temp = array[j];
                array[j] = array[pivotIdx];
                array[pivotIdx] = temp;
            }
        }
        int temp1 = array[R];
        array[R] = array[pivotIdx + 1];
        array[pivotIdx + 1] = temp1;
        return pivotIdx + 1;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 8, 5, 9, 7, 0, 6, 4};
        sort.ArrayUtils.showArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("QuickSort array is: ");
        sort.ArrayUtils.showArray(arr);

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        try {
            if (n >= 6){
                System.out.println("Aici nu ar trebui sa se ajunga\n deoarece indexul e mai mare ca 6 ");
            }
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Am prins exceptia " + e);
        }
            for (int i = 0; i < n; i++) {
                array[i] = s.nextInt();
        }


        sort.ArrayUtils.showArray(array);
        quickSort(array, 0, array.length - 1);
        sort.ArrayUtils.showArray(array);

    }
}
