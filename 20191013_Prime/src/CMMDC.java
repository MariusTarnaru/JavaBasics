public class CMMDC {
    public static void main(String[] args) {
        int a = 45;
        int b = 63;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
