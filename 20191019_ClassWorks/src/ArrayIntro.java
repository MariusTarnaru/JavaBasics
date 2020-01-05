import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        int n = 5;
        int[]a = new int[n];
        a[0] = 7;
        a[1] = 22;
        a[2] = 14;
        a[3] = 9;
        a[4] = 12;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        Scanner s = new Scanner(System.in);
        for(int i = 0;  i < a.length; i++){
            System.out.println("Value for index " + i + ": ");
            a[i] = s.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
