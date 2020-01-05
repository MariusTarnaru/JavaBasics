import java.util.Scanner;

public class Input2Numbers {                    // nr de la 0 la n impartite la m in ordine...
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println("Numerele in ordine crescatoare: ");     //impartire in ordine crescatoare
        for (int i = 0; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Numerele in ordine descrescatoare: ");  // imprtirea 0..n la m in ordine descrescatoare
        for (int j = n; j >= 0; j--) {
            if (j % m == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        int sum = 0;                                // suma numerelor rezultate in urma impartirii
        long prod = 1;
        for (int k = 1; k <= n; k++) {
            if (k % m == 0) {
                sum = sum + k;
                prod = prod * k;                   // produsul numerelor rezultate in urma impartirii
            }
        }
        System.out.print("Suma este: ");
        System.out.print(sum + " ");
        System.out.println();
        System.out.print("Produsul este: ");
        System.out.print(prod + " ");
    }
}
