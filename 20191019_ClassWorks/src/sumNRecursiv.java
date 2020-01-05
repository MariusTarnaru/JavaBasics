public class sumNRecursiv {

    public static int sumN(int n){
        if (n == 0) {
            return 0;
        } else {
            int s = sumN(n-1) + n;
            return  s;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int sum = sumN(n);
        System.out.println(sum);
    }

}
