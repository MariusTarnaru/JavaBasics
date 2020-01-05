import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        Rectangle r1 =new Rectangle (a1,a2);
        System.out.println("Perimeter have value: " + r1.GetPerimeter());
        System.out.println("Area of rectangle is: " + r1.GetArea());
        System.out.println("Diagonal of rectangle is: " + r1.GetDiag());
    }
}
