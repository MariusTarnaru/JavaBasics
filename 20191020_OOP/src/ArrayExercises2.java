import java.util.Scanner;
import java.util.Random;

public class ArrayExercises2 {

    public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean areValuesSmallerThanN(int[] a, int n) {
        // determinam DACA exista valori < 10
        // presupun ca nu exista valori < 10
        boolean areSmallerThanN = false;
        // declar o variabila ce o voi folosi pentru index de acces
        int i = 0;
        // cat timp
        // nu depasesc LIMITELE ARRAY-ului
        // si nu am gasit elemente < 10
        while (i < a.length && areSmallerThanN == false) {
            // verific daca VALOREA de la indexul i este < n
            if (a[i] < n) {
                // daca am gasit MACAR o valoare inseamna ca
                // in array exista macar o valoare < n
                areSmallerThanN = true;
                System.out.println("prima valore < " + n + " : " + a[i]);
                System.out.println("indexul primei valori < " + n + ": " + i);
            }
            i++;
        }
        return areSmallerThanN;
    }

    public static void main(String[] args) {
        //declar scanner
        Scanner s = new Scanner(System.in);
        // citesc o valoare in variabila n
        System.out.println("introduceti o valoare pentru n:");
        int n = s.nextInt();
        // declar un array de tip int de dimensiune n
        int[] a = new int[n];
        // parcurg indecsii array-ului si
        // citesc o valoare pentru fiecare pozitie
        for (int i = 0; i < a.length; i++) {
            System.out.println("introduceti o valoare pentru pozitia " + i + ": ");
            a[i] = s.nextInt();
        }
// apelez metoda showArray definita mai sus
        System.out.println("a[]: ");
        showArray(a);
// o alta metoda de a declara si initializa un array cu valori
// array declarat explicit
        int[] b = {7, 8, 9, 4, 3};
        // apelez metoda showArray cu parametru array-ul b
        System.out.println("b[]: ");
        showArray(b);
// initializez un generator de numere aleatorii
        Random random = new Random();
//generez o valoare random de max 20
// si salvez valoare in variabila cSize
        int cSize = random.nextInt(20);
// declar si initializez un array de dimensiune cSize
        int[] c = new int[cSize];
// pentru fiecare index al array-ului
// generez o valorea aleatorie la pozitia respectiva
        for (int i = 0; i < c.length; i++) {
            c[i] = random.nextInt(30);
        }
// afisez array-ul c
        System.out.println("(generat aleatoriu) c[]: ");
        showArray(c);
// pentru fiecare element din array-ul a
// adaug un 1 daca elementul este impar
// o valoare este impara cand restul impartii la 2 == 1 || != 0
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                a[i] = a[i] + 1;
            }
        }
        System.out.println("(dupa + 1) a[]: ");
        showArray(a);

        System.out.println("test if there are values smaller than: ");
        int valuesSmallerThan = s.nextInt();
        boolean areSmallerThanN = areValuesSmallerThanN(a, valuesSmallerThan);
        if (areSmallerThanN) {
            System.out.println("inca exista valori < " + valuesSmallerThan);
        } else {
            System.out.println("nu exista valori < " + valuesSmallerThan);
        }

    }
}
