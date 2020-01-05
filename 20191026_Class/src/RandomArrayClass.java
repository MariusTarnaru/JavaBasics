import java.util.Random;

public class RandomArrayClass {

    private static void arrayR(int[] r) {
        Random random = new Random();
        System.out.print("Numere pana la " + r.length + " sunt: ");
        for (int i = 0; i < r.length; i++) {
            int x = random.nextInt(10+1);
            System.out.print(" " + x);
        }
    }

    public static void main(String[] args) {
        int[] r = new int[10];

        int[] a1 = {3, 5, 7, 5, 3, 2, 9, 2, 1};
        arrayR(a1);
        System.out.println();
        arrayR(r);


    /*    for (int j = 0; j < rand.length; j++) {
            System.out.println(" " + arrayR());
        }

      /*  int p = r % 2;
        boolean isEven = true;
        while (isEven && r < 6) {
            System.out.print(" " + p);
            isEven = false;
        }*/

        //            return r;
//        }


    }
}
