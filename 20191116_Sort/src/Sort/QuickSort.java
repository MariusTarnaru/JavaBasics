package Sort;

public class QuickSort {

    void quicksort(int arr[], int l, int r) {
        // conditie oprire recursivitate
        if (l < r) {
            // aflam indexul pivotului
            int pivotIdx = partition(arr, l, r);

            // apelam quicksort pe elementele din stanga pivotului
            quicksort(arr, l, pivotIdx - 1);

            // quicksort pe elementele din dreapta pivotului
            quicksort(arr, pivotIdx + 1, r);
        }
    }

    int partition(int arr[], int l, int r) {
        // luam ca pivot ultimul element din array
        // sunt mai multe variante posibile. Se poate lua ca pivot primul element,
        // mijlocul array-ului sau chiar un element random
        int pivotValue = arr[r];
        int pivotIdx = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] < pivotValue) {
                pivotIdx++;

                int temp = arr[j];
                arr[j] = arr[pivotIdx];
                arr[pivotIdx] = temp;
            }
        }

        // swap intre pivot si pozitia pivotului identificata
        int temp = arr[pivotIdx + 1];
        arr[pivotIdx + 1] = arr[r];
        arr[r] = temp;

        // returnam pozitia pivotului
        return pivotIdx + 1;
    }

    public static void main(String[] args) {
        //read
        int arr[] = {12, 11, 13, 5, 6, 7};

        //sort
        QuickSort qs = new QuickSort();
        qs.quicksort(arr, 0, arr.length - 1);

        //print
        sort.ArrayUtils.showArray(arr);
    }
}
