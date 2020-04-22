package Methods;

import java.util.Scanner;

//Să se creeze o metodă public static void afiseazaNr(int nr) care afişează
// numărul primit ca parametru. Numărul este introdus de la tastatură. Să se invoce metoda.
public class AfiseazaNumar {

    public static void main(String[] args) {
        afiseazaNumar();
        afiseazaNumar();
    }

    private static void afiseazaNumar() {
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        System.out.println("Numarul introdus este: " + numar);
    }

}
