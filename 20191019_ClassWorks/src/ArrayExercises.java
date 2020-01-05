import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        //declaram un scanner
        // citim n
        //declaram un array de n elemente
        //citim elementele array-ului
        //afisam elementele array-ului
        //determinati valoarea maxima din array si pozitia la care se afla

        // cititi o valoare de la consola
        // daca valoarea se afla in array afisati indexul ei
        // daca nu se afla in array afisati -1
        Scanner s = new Scanner(System.in);     // declaram un Scanner
        int n = s.nextInt();                    // citim n (nr de elemente ale arrayului)
        int[] a = new int[n];                   // declaram un array de n elemente
        for (int i = 0; i < a.length; i++) {    // citim elementele array-ului (cele n elemente..
            a[i] = s.nextInt();                 // ...declarate mai sus)
        }
        for (int i = 0; i < a.length; i++) {    //afisam elementele array-ului (cele n elemente)
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {               // testeaza numerele fata de primul index si
                max = a[i];                 // salveaza valoarea curenta in max
                maxIndex = i;                    // position este indexul i unde a gasit numarul max
            }
        }
        System.out.println();
        System.out.println(max + " ");
        System.out.println(maxIndex + " ");
// cititi o valoare de la consola
// daca valoarea se afla in array afisati indexul ei
// daca nu se afla in array afisati -1
        System.out.println("Introduceti valoarea cautata: ");
        int search = s.nextInt();
        int nIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (search == a[i]) {
                nIndex = i;
            }
        }
        System.out.println("Ultima aparitie la care s-a gasit este: " + nIndex);
// afisam indexul primei aparitii
        nIndex = -1;
        int i = 0;
        while (i < a.length && nIndex == -1) {
            if (search == a[i]) {
                nIndex = i;
            }
            i++;
        }
        System.out.println("Prima aparitie a numarului este la pozitia: " + nIndex);

// afisati indecsii la care se afla valori pare
        for (i = 0; i < a.length; i++) {            // se parcurge array-ul
            if (a[i] % 2 == 0) {                    // daca valoarea nr este para
                System.out.print(i + " ");          // se afiseaza nr par din array
            }
        }
        System.out.println();
//afisati indecsii la care se afla valori impare
        for (i = 0; i < a.length; i++) {           // se parcurge tot array-ul
            if (a[i] % 2 != 0) {                   // daca nr nu este par
                System.out.print(i + " ");         // se afiseaza nr impar din array
            }
        }


    }

}
