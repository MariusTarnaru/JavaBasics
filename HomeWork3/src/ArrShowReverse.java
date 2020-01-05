import java.util.Scanner;
//write an array and show it in reverse order
public class ArrShowReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write array dimension: ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n  ; i++) {
            a[i] = scan.nextInt();
            System.out.println("Index value is: " + i);
        }
        System.out.println();
        for (int i = a.length-1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }


    }
}
