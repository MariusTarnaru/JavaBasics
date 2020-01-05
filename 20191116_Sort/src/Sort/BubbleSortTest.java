package Sort;

import java.util.Scanner;

public class BubbleSortTest {
    public static void bubblesort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swapped = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swapped == false)
                break;
        }

    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7};
        bubblesort(arr);
        sort.ArrayUtils.showArray(arr);

        int[] array1 = readArray();
        sort.ArrayUtils.showArray(array1);
        bubblesort(array1);
        sort.ArrayUtils.showArray(array1);
    }
}

