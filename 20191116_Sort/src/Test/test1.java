package Test;

public class test1 {


    public static void main(String[] args) {
        int x = 9;
        int y = 4;
        int z = Math.abs(y - x);                 //rezultatul este 5
        System.out.println(z);
        char e = '\n';
        System.out.println(e);
        String[] name = {"ali", "ada", "sol"};
        System.out.println(name[3 % 10 - 1]);       // rezultatul este "sol"
        System.out.println(3 % 10 - 1);                 // rezultatul este 2

        int a = 5, f = 3;
        for (; ; ) {
            if ((a += f + 1) > 8)
                break;
            else
                f = a % (f + 1);
        }
        System.out.println(f * a);              // rezultatul este 3 * 9 = 21 pt ca s-a facut break
        System.out.println();
        //arraycopy object with method to copy from source to destination with position and length
        // sout is 0 0 0 3 4 0
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {0, 0, 0, 0, 0, 0};
        System.arraycopy(array1, 2, array2, 3, 2);
        for (int i : array2)
            System.out.println(i);

    }
}
