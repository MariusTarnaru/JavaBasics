public class Methods {

    public static void showHelloWorld(){
        System.out.println("Hello World !");
    }
    public static void showNumber(int n){
        System.out.println("Number is: " + n);
    }
    public static int addNumbers(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        showHelloWorld();
        showHelloWorld();

        showNumber(5);
        showNumber(7);
        int a = 567;
        showNumber(a);
        showNumber(a+5463);

        int sum = addNumbers(5,8);
        System.out.println(sum);
        sum = addNumbers(sum, sum);
        System.out.println(sum);

        showNumber(addNumbers(23,71));
    }
}
