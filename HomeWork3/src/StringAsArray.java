/* STRING AS AN ARRAY METHODS - sorting a string

    input: a string of words, aka a sentence
    output: the same string, but sorted in an array

*/

import java.util.Scanner;
import java.util.Arrays;

public class StringAsArray
{
    public static void main(String args[])
    {
        System.out.println("JUST SOME SIMPLE STRING and ARRAY METHODS\nEnter a string of several words (aka a sentence).");
        System.out.println("--------------------------------");
        // user inputs a sentence
        Scanner input = new Scanner(System.in);
        // check if there is a valid input
       /* if (!input.hasNext()) {
            System.out.println("You forgot to enter a string. Please try again.");
            return;
        }*/

        String s1 = input.nextLine();
        System.out.println("The string you entered:\n\t" + s1);
        // take out punctuation, turn all characters to lowerCase and remove trailing space
        String s2 = s1.toLowerCase().replaceAll("[^a-z]+", " ").trim();
        System.out.println("\nThis string consists of " + s1.length() + " characters (including the punctuation).");
        System.out.println("And without counting the punctuation, there are " + s2.length() + " characters.");
        // turn the string into an array
        String[] arrayS = s2.split(" ");
        System.out.println("\nThe string as an array of words:\n\t" + Arrays.toString(arrayS));
        // count the number of words
        System.out.println("\nThis array contains " + arrayS.length + " elements.");
        // what is the longest word in the string - use the method in the main
        int longest = 0;
        longest = longestWord(arrayS, longest);
        System.out.println("\nThe longest word in the array is:\n\t" + arrayS[longest]);
        // and where can you find this word
        System.out.println("\nThe longest word can be found at position " + s2.indexOf(arrayS[longest]) + " in the string (not counting the punctuation).");
        System.out.println("\nAnd in the array at position: " + longest);
        // sort the array by length of words - method in the main
        bubbleSort(arrayS, arrayS.length);
        System.out.println("\nThe array sorted by length of words:\n\t" + Arrays.toString(arrayS));
        // sort the array alphabetically, with the Array method sort
        Arrays.sort(arrayS);
        System.out.println("\nThe same array, but sorted in alphabetical order:\n\t" + Arrays.toString(arrayS));
        // the end
        System.out.println("\n------------------------------");
    }

    // function to search for the longest word in the array
    public static int longestWord(String[] arr, int longest) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i].length()>= arr[longest].length()) {
                longest = i;
            }
        }
        return longest;
    }
    // recursive function to sort by number, smallest number first
    public static String[] bubbleSort(String[] arr, int len) {
        String temp = "";
        if (len==1) return arr;
        for (int i=0; i<len-1; i++) {
            if (arr[i].length()>arr[i+1].length()) {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, len-1);
        return arr;
    }
}
