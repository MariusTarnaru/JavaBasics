public class Rectangle {
    public static double largeSide;
    public static double smallSide;

    public Rectangle(double largeSide, double smallSide){
        this.largeSide = largeSide;
        this.smallSide = smallSide;
    }
    public double GetArea(){
        return largeSide *smallSide;
    }
    public double GetPerimeter(){
        return (2 * smallSide) + (2 * largeSide);
    }
    public double GetDiag(){
        return Math.sqrt( Math.pow(largeSide, smallSide));
    }

}
