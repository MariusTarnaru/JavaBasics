import java.util.Scanner;
//write numbers from 0 to 99; write odd numbers from 0 to 99; write even numbers from 0 to 99
public class HomeWork2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Numerele pare sunt: ");
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Numerele impare sunt: ");
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    }
}
