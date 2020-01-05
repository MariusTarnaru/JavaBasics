import java.util.Random;

public class Ex14cuRandom {
    public static void main(String[] args) {

        Random r = new Random();
        int prod = 1;
        while(prod <= 100){
            int n = r.nextInt(10);
            System.out.println("citit: " + n);
            prod = prod * n;
        }
        System.out.println(prod);
    }
}
