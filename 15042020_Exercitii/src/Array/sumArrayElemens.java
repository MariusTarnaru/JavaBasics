package Array;

import java.util.Scanner;

//Creează un array de 10 elemente în care să introduci numere citite de la tastatură.
//Calculează suma elementelor şi afişeaz-o.

public class sumArrayElemens {

    private static int[] integerArray(){
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }
    private static int sumElements(){
        int[] myArray = integerArray();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = sumElements();
        System.out.println(number);
    }
}
