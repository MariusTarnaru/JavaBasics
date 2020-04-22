package Methods;
//Să se creeze o metoda public static int ridicaLaPatrat(int nr) care
// returnează pătratul unui număr. Numărul este introdus de la tastatură
// în altă metodă şi returnat ca parametru. Să se invoce metoda.
import java.util.Scanner;

public class RidicaLaPatrat {

    public static void main(String[] args) {
        int number = citesteNumar();
        System.out.println("Patratul numarului este: " + ridicaLaPatrat(number));
    }

    private static int citesteNumar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        try{
            int numar = scanner.nextInt();
            return numar;
        }catch (Exception ex){
            System.out.println("Nmarul nu este valid sau ati introdus gresit !");
            System.out.println("Incercati din nou introducrerea unui numar !");
        }
        return 0;
    }

    private static int ridicaLaPatrat(int numar) {
        int patratulNumarului = numar * numar;
        return patratulNumarului;
    }
}
