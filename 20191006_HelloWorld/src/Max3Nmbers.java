public class Max3Nmbers {
    public static void main(String[] args) {
        int a = 33;
        int b = 12;
        int c = 66;
        if (a > b) {
            if (a > c) {
                System.out.println("Valoarea este: ");
                System.out.println(a);
            } else {
                System.out.println("Valoarea este: ");
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println("Valoarea este: ");
                System.out.println(b);
            } else {
                System.out.println("Valoarea este: ");
                System.out.println(c);
            }
        }
        if (a > c) {
            System.out.println("Valoarea este: ");
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}

