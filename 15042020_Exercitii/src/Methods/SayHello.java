package Methods;

//Să se creeze o metodă public static void sayHello()
// care afișează "Hello" de 10 ori. Să se invoce metoda.
public class SayHello {

    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            count++;
            sayHello();
        }
    }

    private static void sayHello() {
        System.out.println( "Hello !");
    }

}
