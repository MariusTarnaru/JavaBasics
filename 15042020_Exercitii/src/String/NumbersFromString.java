package String;

public class NumbersFromString {

    private static String returnNumbers(String string){
        String number = "";
        String character = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)){
                number += String.valueOf(ch);
            }
            else{
                character += String.valueOf(ch);
            }
        }
        return number.concat("\n" + character);
    }

    public static void main(String[] args) {
        String myString = "175abd43mne765g7ASD@()*^FTR845RTD9jh32";
        System.out.println(returnNumbers(myString));
    }
}
