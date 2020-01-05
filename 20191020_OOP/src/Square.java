public class Square {

    public static final int EDGES = 4;          // definim parametru fix de numar de laturi ale patratului
    public static final int HALF_EDGES = 2;

    public double side;

    public Square(double side){                 //ptr a prelua valoarea numerica a side - ului, laturii
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }
    public double getDiag(){
        return Math.sqrt(HALF_EDGES * side * side);
    }
    public double getPerimetter(){
        return EDGES * side;
    }

}




