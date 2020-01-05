public class NumberOperations {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c;

        System.out.println("max of a and b: ");     // Se scrie in consola "max of a nad b"
        if (a > b) {
            System.out.println(a);                  //daca a este mai mare decat b atunci se afiseaza valoarea lui a
        } else {
            System.out.println(b);                  // daca nu atunci se afiseaza valoarea lui b
        }

        if (a % 2 == 0) {                           // se testeaza daca restul impartirii lui a  la 2 ese o
            System.out.println(a + " is even");     // daca da atunci a este numar par
        } else {
            System.out.println(a + " is odd");      // daca nu atunci numarul a este impar
        }

        System.out.println("difference a - b:");    //diferenta dintre a si b este salvata in variabila c
        c = a - b;
        System.out.println(c);                      // se afiseaza variabila c

        if (b < a) {                                // daca b mai mic decat a se incrementeaza cu 1 valoarea lui a
            a = a + 1;
        } else {
            b = b - 1;                              // daca nu (b  este mai mare decat a) de decrementeaza cu 1 variabila b
        }

        boolean areEqual;                           //daca valoarea lui a este egala cu valoarea lui b este TRUE
        areEqual = (a == b);
        System.out.println(areEqual);
        if (areEqual) {
            System.out.println("right now, numbers are equal");         //daca areEqual este TRUE se afiseaza mesajul
        } else {
            System.out.println("right now, numbers are NOT equal");     // daca areEqual este FALSE se afiseaza mesajul
        }

        System.out.println("sum a + b:");
        System.out.println(a + b);                  // se calculeaza suma variabilelor a si b si se afiseaza

        System.out.println("sum a,b,c:");
        int sumAllThree = a + b + c;                // se calculeaza suma variabilelor a,b si c si se afiseaza
        System.out.println(sumAllThree);

        if(sumAllThree > 10){                       // daca suma a,b,c este mai mare ca 10 atunci
            if(sumAllThree % 2 == 0){               //daca restul impartirii la 2 (modulo 2) este 0
                System.out.println("sum is even");  // atunci numarul (variabila) sumAllThree este para
            } else {                                // daca nu (rezultatul impartirii modulo2) nu este 0
                System.out.println("sum is odd");   //sumAllThree este impara si se afiseaza mesajul string din paranteze
            }
        }
    }
    }

