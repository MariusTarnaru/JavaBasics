public class Triangle {

    public static double cathetus1;
    public static double cathetus2;
    public static double hypotenuse;
    public static double semiper;

  // public static double sem;

    public Triangle(double cath1, double cath2, double hypot) {
        this.cathetus1 = cath1;
        this.cathetus2 = cath2;
        this.hypotenuse = hypot;
    }

    public double GetPerimeter(){
        return cathetus1 + cathetus2 + hypotenuse;
    }


    // to found Area i used Heron formula

    public double GetArea(){

        double area = Math.sqrt(semiper * (semiper - cathetus1) * (semiper - cathetus2) * (semiper - hypotenuse));
        return area;

    }

    public Double Semiperimeter() {
        this.semiper = semiper;
        return semiper = (cathetus1 + cathetus2 + hypotenuse) / 2;
    }
}
