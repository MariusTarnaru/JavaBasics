package Sort;

import java.util.Scanner;

public class Sort {
    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];   // salveaza valoarea minima gasita in min_idx in variabila temp
            arr[min_idx] = arr[i];     // se face swap intre valoarea de la index i si del la locatia min_idx
            arr[i] = temp;             // valoarea din temp se copie in locatia i din array si astfel se muta minimul la locatia corecta
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        {
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Citeste dimensiunea array-ului
        System.out.println("How big should the array be?");
        int size = scanner.nextInt();
        //citeste elementele array-ului
        System.out.println();
        System.out.println("Type in " + size + " elements:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
       /* printArray(array);
        sort.ArrayUtils.showArray(array);
        sort(array);
        //printArray(array);*/
        sort.ArrayUtils.showArray(array);
 //..................................  am facut eu  ............................................
        System.out.println("Sortarea folosind metoda sortMethod: ");
        SortMethod.sortMethod(array);
        sort.ArrayUtils.showArray(array);

    }
}