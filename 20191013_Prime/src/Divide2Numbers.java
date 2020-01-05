//afisati pe o singura linie restul impartirii la 2 a numerelor de la 0 pana la n
// (n declarat si initializat sau citit de la consola)

import java.util.Scanner;

public class Divide2Numbers {
    public static void character() {
        System.out.print("#");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Numarul introdus este : " + n);
        System.out.println("Restul impartirii la 2 este: ");
        for (int i = 0; i <= n; i++) {
            int result = i % 2;
            System.out.print(" " + result);
        }
        System.out.println();

        //afisati la consola urmatorul mesaj
        //
        //# # # # # # #
        // # # # # # # #
        //# # # # # # #
        // # # # # # # #
        //# # # # # # #
        // # # # # # # #
        //# # # # # # #
        int j = 0;
        while (j < 7) {
            for (int k = 0; k < 7; k++) {
                System.out.print("# ");
            }
            System.out.println();
            j++;
            if (j < 7) {
                for (int k = 0; k < 7; k++) {
                    System.out.print(" #");
                }
                System.out.println();
                j++;
            }
        }

/* afisati la consola urmatorul mesaj

#
##
###
####
#####
######
########    */
        int p = 0;
        while (p <= 8) {
            for (int i = 0; i < p; i++) {
                if (p != 7) {
                    character();
                }
            }
            if (p != 7) {
                System.out.println();
            }
            p++;
        }

    }
}



