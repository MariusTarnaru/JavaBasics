//Scrieti o metoda ce primeste ca paremetru un array.
//Parcurgeti array-ul si, pentru fiecare element,
// afisati daca exista o alta aparitie a acestui element in array
// in dreapta fata de aparitia curenta.
public class ARR4 {
    public static void main(String[] args) {

        int[] a = {11, 6, 11, 7, 6, 7, 9, 21, 36};
            boolean found = false;
        for (int i = 0; i < a.length ; i++) {
            found  = false;
            int j = i + 1;
            while(!found && j < a.length){
                if(a[i] == a[j]){
                    found = true;
                }
                j++;
            }
            System.out.println(a[i] + " " + found);

        }



//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//
//                if ( i ! = j & a[i] == a[j] && isTrue) {
//                    System.out.println(a[j] + "-true");
//                    System.out.println(a[j] + "-false");
//                }
//            }
//        }

    }
}

