public class isPalindrom {
    public static void main(String[] args) {
        int n = 37573;
        int m = n;                  // se foloseste variabila m pentru ca va fi alterata, va deveni 0 in bucla while
        int newN = 0;               //numarul palindrom va fi la start initializat cu 0 la final va fi inversul nr n
        while (m > 0) {
            int r = m % 10;             // se obtine restul impartirii la 10
            newN =  newN * 10 + r;      //se reface numarul in newN
            m = m  / 10;
        }
        if (n == newN){
            System.out.println("Numarul " + n + " este palindrom !");
        }
        else {
            System.out.println( "Numarul " + n + " NU este palindrom !");
        }
    }
}
