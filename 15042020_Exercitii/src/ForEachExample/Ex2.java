package ForEachExample;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    //Se citeşte un număr n care reprezintă lungimea unui vector. Creaţi vectorul de lungime n,
    // puneţi valori aleatoare pe fiecare poziţie (între 1 şi 100) şi afişaţi vectorul.
    public static void main(String[] args) {
        //randomArrayByDimenssionN();
        int[] sortedArray = bubbleSortArray(randomArrayByDimenssionN());
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] randomArrayByDimenssionN() {
        int[] myArray = randomNumbersArray();
        System.out.println("My random array is:");
        for (int number : myArray) {
            System.out.print(number + " ");
        }
        return myArray;
    }

    private static int[] randomNumbersArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write one number for dimension of your array: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            int number = (int) (Math.random() * 100) + 1;
            myArray[i] = number;
        }
        return myArray;
    }

    private static int[] bubbleSortArray(int[] randomArray) {
        int n = randomArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (randomArray[j] > randomArray[j + 1]) {
                    int temp = randomArray[j];
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j + 1] = temp;
                }
            }
        }
        return randomArray;
    }

}
