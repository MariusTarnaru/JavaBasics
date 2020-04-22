package Array;

//Creează un vector care reţine 1000 de valori. Pune în el diverse valori.
//Afişează vectorul, apoi afişează doar numerele cu 0 în coadă (ex: 10, 20, 30, etc…).
public class Ex2 {

    private static int[] generatedArray() {
        int[] myArray = new int[1000];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 3; // formula oarecare de a salva 1000 numere in array
        }
        return myArray;
    }

    private static void showArray() {
        System.out.println("My array is: ");
        for (int i = 0; i < generatedArray().length; i++) {
            System.out.println(generatedArray()[i]);
        }
    }

    private static void numberTenth() {
        System.out.println("Numerele ce se termina in 0 sunt: ");
        for (int i = 0; i < generatedArray().length; i++)
            if ((generatedArray()[i] % 10) == 0) {
                System.out.print(generatedArray()[i] + "  ");
            }
    }

    public static void main(String[] args) {
        showArray();
        numberTenth();

    }
}

