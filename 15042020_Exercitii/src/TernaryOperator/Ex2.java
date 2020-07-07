package TernaryOperator;

public class Ex2 {

    public static void main(String[] args) {
        int n1 = 5, n2 = 10, result;

        result = (n1 > n2) ? (n1 + n2) : (n1 - n2);
        System.out.println("Result is: " + result);

        n1 = 20; n2 = 6;
        result = n2 < n1 ? n1 - n2 : n1 + n2;
        System.out.println("Your result is: " + result);

        n1 = 50; n2 = 5;
        result = n2 < n1 ? n1 / n2 : n2 / n1;
        System.out.println("Your result is: " + result);
    }
}
