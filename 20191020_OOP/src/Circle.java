public class Circle {

    public static final double PI = 3.14;

    public double radius;

    public Circle() {       // constructor initial by default

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public static void showPI(){
        System.out.println(PI);
    }

    public double getDiameter(){

        return 2 * radius;
    }
    public double getCircumference(){
        return 2 * PI * radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

}
