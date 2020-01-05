public class MultiplicationTable {

    public static void main(String[] args) {
        int i = 0;
        while (i<=10) {
            int j = 0;
            while (j <= 10) {
                int multiplication = i * j;
                System.out.println(i + " * " + j + " = " + multiplication);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
