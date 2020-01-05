public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(7);       // acesta se numeste constructor
//        c1.radius = 7;

        Circle c2 = new Circle();
        c2.radius = 3;

        System.out.println(c1.radius);
        System.out.println(c2.radius);

        System.out.println("Diametrul cercului de raza 7 este: ");
        System.out.println(c1.getDiameter());
        System.out.println(c2.getDiameter());

        System.out.println("Circumferinta cercului de raza 7 este:" + c1.getCircumference());
        System.out.println(c1.getCircumference());
        System.out.println(c2.getCircumference());

        System.out.println("Circle area on radius of 7 is: ");
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());

        System.out.println(Circle.PI);

        Circle c3 = new Circle(7);
        System.out.println(c3.getDiameter());
        System.out.println(c3.getCircumference());
        System.out.println(c3.getArea());

        Circle.showPI();

//        Circle.PI = 2;    // nu se poate modifica


    }
}
