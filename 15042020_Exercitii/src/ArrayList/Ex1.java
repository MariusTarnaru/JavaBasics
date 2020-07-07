package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Ex1 {
    //Creați o listă (ArrrayList) de avioane folosind variabile pe stack

    public static void main(String[] args) {
        Collection avioane = Arrays.asList(new String[]{"Boing", "Airbus", "Tarom", "Concorde", "IAR", "Cessna"});
        System.out.println("Dimensiunea colectiei: " + avioane.size());
        for (Object object : avioane) {
            System.out.print(" " + object);
        }
        ArrayList aeroplane = new ArrayList<>();
        aeroplane.addAll(avioane);
        System.out.println();
        for (Object obj : aeroplane) {
            System.out.print(" " + obj);
        }
        System.out.println("\nArrayListul este: " + aeroplane);
        System.out.println(avioane);
        System.out.println("Cele doua oboecte sunt identice ?  -> " + aeroplane.equals(avioane));
   //Afișați avionul de pe indexul 3
        System.out.println("Avionul de pe indexul 3 este: " + aeroplane.get(3));
   //Înlocuiţi un avion cu altul nou.
        aeroplane.set(0, "Lockheed");// se poate folosi si aeroplane.add(..index..,..element..)
        System.out.println("Avionul de pe indexul 0 \nce a inlocuit Boing este: " + aeroplane.get(0));
        System.out.println("ArrayList-ul devine: " + aeroplane);
        System.out.println("Colectia ramane neschimbata: " + avioane);
    //Verificați dacă lista de avioane conține un anumit avion.
        for (Object obj : aeroplane) {
            if (obj.toString().equals("Bubu")){
                System.out.println("In lista exista avionul: Bubu");
            }
        }
        System.out.println("In lista nu exista avionul cautat !");

    }
}
