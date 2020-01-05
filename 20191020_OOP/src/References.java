public class References {

    public static void addOne(int x){
    x = x + 1;
}
    public static void addOne(Double x){
        x = x + 1;
    }
    public static void addOne(Circle c){
        c.radius = c.radius + 1;
    }
    public static void main(String[] args) {

        //sending parameter via value
      int a = 5;
        System.out.println(a);
        addOne(a);
        System.out.println(a);

        Circle c1 = new Circle(5);
        System.out.println(c1.radius);
        addOne(c1);
        System.out.println(c1.radius);
        // sending parameter via
       Circle c2 = null;


        System.out.println(c1);
//      System.out.println(c2);
//        System.out.println(c2.radius);

        int b = 45;
//        Double diam = c2.getDiameter();
//        System.out.println(diam);


        Boolean bool1 = true;
        Boolean bool2 = false;
        Boolean bool3 = Boolean.FALSE;
        Boolean bool4 = Boolean.TRUE;

        Integer i1 = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;

        Double d1 = 8D;
        System.out.println(d1);
        addOne(d1);
        System.out.println(d1);

        Integer i3 = 9;
      //  Integer i4 new Integer(9);  // i3 si i4



        // bute - Byte
        // short - Short
        // int - Integer
        // long - Long
        // float - Float
        // double - Double
        // boolean - Boolean
        // char - Char
    }
}
