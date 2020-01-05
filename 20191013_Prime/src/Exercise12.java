import java.util.Scanner;

public class Exercise12 {
    public static int scan() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        return (n);
    }

    public static void main(String[] args) {
//cititi numere de la consola pana cand se citeste un numar par
        scan();
        boolean isEven = true;
        while (isEven == true) {
            if (scan() % 2 == 0) {
                System.out.print("This number are even !");
                isEven = false;
            }
        }

    }

}