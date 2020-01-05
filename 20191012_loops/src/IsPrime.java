public class IsPrime {
    public static void main(String[] args) {
        int n = 41;
        boolean isPrime = true;
        int i = 2;
        while (i < n/2 && isPrime == true ){
            if (n%i == 0) {
                isPrime = false;
                System.out.println("Primul divizor este:  " + i);
            }
            i++;
        }
       // System.out.println(isPrime);
        if (isPrime = true){
            System.out.println("Numarul  " + n + "  este numar prim !" );
        }else {
            System.out.println("Numarul  " + n + "  nu este numar prim !" );
        }
    }
}
