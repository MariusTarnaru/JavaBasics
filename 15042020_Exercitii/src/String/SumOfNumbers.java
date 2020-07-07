package String;

public class SumOfNumbers {

    //Java program to calculate sum of all numbers present
    //// in a string containing alphanumeric characters
    //Ex: 12abcd32  -- sum = 44;

 private static int findSum(String string){

     String temp = "";
     int sum = 0;

     for (int i = 0; i < string.length(); i++) {
         char character = string.charAt(i);
         if (Character.isDigit(character))
             temp += character;
         else
         {
             //increment sum by number found earlier
             sum += Integer.parseInt(temp);
             //reset temorary string to empty
             temp = "0";
         }
     }
     return sum + Integer.parseInt(temp);
 }

    public static void main(String[] args) {
        String myString = "10agrfe20GTR60";
        System.out.println(findSum(myString));
    }
}
