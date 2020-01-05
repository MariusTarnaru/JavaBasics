import java.util.Arrays;
import java.util.Scanner;

public class ShowWithWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int i = 0;
        int[] a = new int[6];

        while (i < a.length) {
            a[i] = s.nextInt();
            i++;
        }
        i = 0;
        while (i < a.length){
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.println();
        System.out.print(Arrays.toString(a));
    }
}
