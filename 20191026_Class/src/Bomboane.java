import java.util.Random;

/*La gradinita sunt 10 copii.
Fiecare copil are un numar pe tricou de la 0 la 9.
Intr-o zi fiecare copil primeste un numar aleatoriu intre 1 si 5 bomboane.
Fiecare copil mananca cate o bomboana.
Apoi, copii incep sa treaca prin fata borcanului de bomboane in ordinea numerelor de pe tricou.
Daca un copil are mai putin de 15 bomboane, el are dreptul sa ia un numar aleatoriu de bomboane
dupa urmatoarea regula:

daca numarul curent de bomboane este par el poate sa ia maxim 3 bomboane.
// a[i] = a[i] + random.nextInt(3) + 1;

daca numarul curent de bomboane este impar el poate sa ia maxim 2 bomboane.
// a[i] = a[i] + random.nextInt(2) + 1;

Cand toti copii au macar 15 bomboane turul prin fara borcanului de bomboane se opreste SAU
CA SI CUM AS SPUNE Cand nu exista nici un copil care sa aiba mai putin de 15 bomboane turul
se opreste.*/
public class Bomboane {

    public static void showArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] bomboane = new int[10];
        showArray(bomboane);
        System.out.println();
        for (int i = 0; i < bomboane.length; i++) {
            bomboane[i] = random.nextInt(5) + 1;
        }
        showArray(bomboane);

        // exista macar un copil care are mai putin de 15 bomboane
        boolean eLess15 = true;
        while (eLess15) {
            // copiii iau bomboane din borcan
            for (int i = 0; i < bomboane.length; i++) {
                // un copil ia bomboane din borcan doar daca are mai putin de 15
                if (bomboane[i] < 15) {
                    if (bomboane[i] % 2 == 0) {
                        bomboane[i] = bomboane[i] + random.nextInt(3) + 1;
                    } else {
                        bomboane[i] = bomboane[i] + random.nextInt(2) + 1;
                    }
                }
            }
            // presupun ca nu exista nici un copil care are mai putin de 15 bomboane
            eLess15 = false;
            /*
            for (int i = 0; i < bomboane.length; i++) {
                if (bomboane[i] < 15) {
                    eLess15 = true;
                }
            }
            */
            int i = 0;
            while(i < bomboane.length && eLess15 == false){
                if (bomboane[i] < 15) {
                    eLess15 = true;
                }
                i++;
            }
            showArray(bomboane);
        }
    }
}
