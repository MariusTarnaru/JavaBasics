package ForEachExample;

import java.util.Scanner;

public class Ex4 {

    //Creaţi un vector cu n numere aleatoare între 0 şi 99 (n introdus de la tastatură).
    // Afişaţi vectorul, elementul minim, elementul maxim, suma elementelor,
    // produsul elementelor diferite de 0, media aritmetică a elementelor
    //Schimbaţi programul astfel încât să afişaţi pe ce poziţie se află minimul si maximul.

    public static void main(String[] args) {
        System.out.println("Introduceti un numar: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] myArray = new int[n];

        System.out.println("Dimensiunea array-ului este: " + n);
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * 100);
            myArray[i] = number;
            System.out.print(" " + myArray[i]);
        }
        int minimElement = myArray[0];
        int maximumElement = myArray[0];
        long produsulElementelor = 1;
        int sumaElemetelor = 0;
        int counter = 0;
        int indexNumarMinim = 0;
        int indexNumarMaxim = 0;
        for (int number : myArray ) {
            if (number < minimElement) {
                minimElement = number;
                indexNumarMinim = counter; }
            if (number > maximumElement) {
                maximumElement = number;
                indexNumarMaxim = counter; }
            if (number > 0 ) {
                produsulElementelor *= number;
                sumaElemetelor += number; }
            counter++;
        }
        System.out.println("\nValoarea cea mai mica din array este: " + minimElement + "\nla pozitia: " + indexNumarMinim);
        System.out.println("Valoarea cea mai mare din array este: " + maximumElement +"\nla pozitia: " + indexNumarMaxim);
        System.out.println("Produsul elementelor din array este: " + produsulElementelor);
        int mediaElementelor = sumaElemetelor / n;
        System.out.println("Madia elementelor din array este: " + mediaElementelor);

    }

}