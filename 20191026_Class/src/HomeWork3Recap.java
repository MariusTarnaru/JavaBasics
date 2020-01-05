public class HomeWork3Recap {

//ARR3
//     Scrieti o metoda ce primeste ca parametrii 2 array-uri de tip int
//     si returneaza un array cu toate elementele din cele 2 array-uri. (concatenate)
//     Sau mai pe scurt o metoda ce concateneaza 2 array-uri.

//ARR4
//     Scrieti o metoda ce primeste ca paremetru un array.
//     Parcurgeti array-ul si, pentru fiecare element, afisati
//     daca exista o alta aparitie a acestui element in array in dreapta fata de aparitia curenta.

/*  ARR5
        Scrieti o metoda ce afiseaza un array in doua jumatati.
        Pe prima linie elementele de la centru spre marginea din stanga. (n/2 -> 0)
        Pe a doua linie elementele de la centru spre marginea din dreapta. (n/2 -> n)
*/
/*  ARR6
        Scrieti o metoda ce primeste ca parametru un array si afiseaza valorile prime din array.
        As prefera daca ati declara algoritmul pentru determinarea daca un numar este prim
        intr-o metoda separata si sa apelati folosind spre exemplu:

        isPrime(a[i])
*/

    public static int[] concatenate(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            int index = a.length + i;
            c[index] = b[i];
        }

        return c;
    }

    public static void showApparitions(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            int j = i + 1;
            while (!found && j < a.length) {
                if (a[i] == a[j]) {
                    found = true;
                }
                j++;
            }
            System.out.println(a[i] + " - " + found);
        }
    }

    public static void showApparitions2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    found = true;
                }
            }
            System.out.println(a[i] + " - " + found);
        }
    }

    public static void showTwoSides(int[] a) {
        int middle = a.length / 2;
        System.out.println("prima jumatate");
        for (int i = middle - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("a doua jumatate");
        for (int i = middle; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static boolean isPrime(int n) {
        boolean nIsPrime = true;
        int i = 2;
        while (i <= n / 2 && nIsPrime == true) {
            if (n % i == 0) {
                nIsPrime = false;
            }
            i++;
        }
        return nIsPrime;
    }

    public static void showPrimesInArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isPrime = isPrime(a[i]);
            if (isPrime) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void showDiff(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int diff = a[i] - a[i + 1];
            System.out.print(diff + " ");
        }
    }

    public static void showDiff2(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int diff = a[i - 1] - a[i];
            System.out.print(diff + " ");
        }
    }

    public static void showAscending(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            if (i < a.length - 1 && a[i] > a[i + 1]) {
                System.out.println();
            }
        }
    }

    public static void showAscending2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i > 0 && a[i - 1] > a[i]) {
                System.out.println();
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        int[] b = {7, 8, 9, 10};
        int[] c = concatenate(a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

        int[] ar4 = {5, 6, 6, 7, 3, 5, 3};
        System.out.println();
        showApparitions(ar4);
        System.out.println();
        showApparitions2(ar4);
        System.out.println();
        showTwoSides(ar4);
        System.out.println();
        System.out.println("primes in array");
        showPrimesInArray(ar4);
        System.out.println();
        showDiff(ar4);
        System.out.println();

        int[] ar8 = {3, 7, 9, 2, 5, 1, 6, 8};
        showAscending(ar8);
        System.out.println();
        System.out.println();
        System.out.println();
        showAscending2(ar8);

    }

}
