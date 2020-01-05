import java.util.Scanner;

public class Primes2 {

    public static boolean isPrime(int n){
        boolean nIsPrime = true;
        int i = 2;
        while (i <= n/2 && nIsPrime == true){
            if(n % i == 0){
                nIsPrime = false;
            }
            i++;
        }
        return nIsPrime;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);             // preia valoarea de la consola (tastatura)
        int n = s.nextInt();
        // determine primes until n
        for (int i = 2; i < n; i++ ){                   // determina nr prim pentru nr i

            boolean isPrime = isPrime(i);

            if (isPrime == true) {
                System.out.print(i +  " ");
            }
        }
        System.out.println();


        // determining first n primes

        int i = 2;
        int primesFound = 0;
        while (primesFound < n) {
            boolean isPrime = isPrime(i);
            if (true == isPrime) {
                System.out.print(i + " ");
                primesFound++;
            }
            i++;
        }

    }
}
