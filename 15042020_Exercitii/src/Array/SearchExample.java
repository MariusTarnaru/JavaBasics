package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchExample {

    public static void main(String[] args) {

        int[] array = {-5, 7, 8, 65, -9, 3, 0, 11, 6, 78, 9};
        Scanner read = new Scanner(System.in);
        System.out.println("Values of the array:\n" + Arrays.toString(array));
        System.out.println("Enter searched number: ");
        String searchedValue = read.nextLine();
        System.out.println();

        isIntegerInArray(array, Integer.parseInt(searchedValue));

    }
    public static boolean isIntegerInArray(int[] arr, int searchingFor){
        for (int value : arr) {
            if (value == searchingFor){
                System.out.println("Number is in array !");
                return true;
            }
        }
        System.out.println("Your number is not in the array !");
        return false;

    }
}
