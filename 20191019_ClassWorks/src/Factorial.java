public class Factorial {

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        } else {
            int f = factorial(n-1);
            f = f * n;
            return f;
        }
    }


    public static void main(String[] args) {

        int n = 5;
        int nFact = factorial(n);
        System.out.println(nFact);


    }
}
