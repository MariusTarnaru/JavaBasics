public class Primes {
    public static void main(String[] args) {
        int n = 20;
        // determine primes until n
        for (int i = 2; i < n; i++ ){                   // determina nr prim pentru nr i
            boolean isPrime = true;
            int j = 2;
            while(j <= i/2 && isPrime ==  true){
                if (i % j  == 0){
                    isPrime = false;
                }
                j++;
            }
            if (isPrime == true) {
                System.out.print(i +  " ");
            }
        }
        System.out.println();


        // determining first n primes

        int i = 2;
        int primesFound = 0;
        while (primesFound < n) {
            boolean isPrime = true;
            int j = 2;
            while (j <= i/2 && isPrime == true) {
                if (i % j == 0) {
                    isPrime  = false;
                }
                j++;
            }
            if (isPrime == true) {
                System.out.print(i + " ");
                primesFound++;
            }
            i++;
        }

    }
}
