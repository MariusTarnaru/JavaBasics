package Sort;

//aceasta este o metoda pentru algoritmul de sortare clasica
//prin care se compara element cu element de la index 0 la n

public class SortMethod {
    public static void sortMethod(int[] array) {
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx])
                    min_idx = j;
            }
            // save minimum value from array in temp variable and make swap
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

}
