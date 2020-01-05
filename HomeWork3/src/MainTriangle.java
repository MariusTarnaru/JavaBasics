import java.util.Scanner;

public class MainTriangle {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(10, 10, 10);

        System.out.println("Perimeter of triangle t1 is: " + t1.GetPerimeter());
 // Pentru a afla aria unui triunghi oarecare se foloseste Formula lui Heron
 // pentru aceasta trebuie aflat semiperimetrul
        System.out.println("Semiperimeter of triangle t1 is: " + t1.Semiperimeter());
        System.out.println("Area of triangle t1 is: " + t1.GetArea());
        Scanner s = new Scanner(System.in);
        double cath1 = s.nextInt();
        double cath2 = s.nextInt();
        double hypot = s.nextInt();
        Triangle t2 = new Triangle(cath1, cath2, hypot);
        System.out.println("Perimeter of triangle t2 is: " + t2.GetPerimeter());
        System.out.println("Semiperimeter of triangle t2 is:: " + t2.Semiperimeter());
        System.out.println("Area of triangle t2 is:: " + t2.GetArea());


    }
}
