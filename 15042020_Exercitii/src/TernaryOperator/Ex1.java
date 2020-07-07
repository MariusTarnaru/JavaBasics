package TernaryOperator;

import java.util.Scanner;

public class Ex1 {
    //compare fixed number whit one number from console with if - else and ternary operator

    public static void main(String[] args) {
        numbersComparing_If_Else();
        numberComparing_Ternary();
        
    }

    private static int writeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your number to compare is: ");
        int n = scanner.nextInt();
        return n;
    }
    
    private static void numbersComparing_If_Else(){
        if (writeNumber() <= 40)  {
            System.out.println("Your number is less or equal than 40  !");
        }else {
            System.out.println("Your number is greater than 40!");
        }
    }
    private static void numberComparing_Ternary() {
        final String message = writeNumber() <= 40 ? "Number is less or equal than 40  !" :
                "Number is greater than 40 !";
        System.out.println(message);
    }
    
}
