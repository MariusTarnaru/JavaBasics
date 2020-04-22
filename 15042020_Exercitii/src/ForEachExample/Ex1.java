package ForEachExample;

public class Ex1 {
//Creaţi un vector de 10 elemente, puneţi valori pe toate poziţiile.
//La final afişaţi-l de două ori, folosind cele 2 for-uri diferite.
    public static void main(String[] args) {

        int[] array = {1, 2, 56, 4, 0, 72, 13, 4, 8, 11};

        for (int number : array ) {
            System.out.print(" " + number);
        }
        System.out.println();
        for (int i = 0; i < array.length ; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
