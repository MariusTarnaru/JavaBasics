public class DataTypes {

    public static void main(String[] args) {

        String myArray[] = {"byte", "char", "short", "int", "long", "float", "double", "boolean"};

        byte myByte = 3;
        char myChar = '\u0063';
        short myShort = 56;
        int myInt = -357;
        long myLong = 8476028L;

        float myFloat = 54205825825820f;
        double myDouble = 4789.325;
        boolean myBoolean = false;

        System.out.println(myByte + " is a byte");
        System.out.println(myChar + " is a char");
        System.out.println(myShort + " is a short");
        System.out.println(myInt + " is a int");
        System.out.println(myLong + " is a long");
        System.out.println(myFloat + " is a float");
        System.out.println(myDouble + " is a double");
        System.out.println(myBoolean + " is a boolean");
        System.out.println("");

        char newChar = (char) myByte;
        System.out.println(newChar + " is now a char");
        byte newByte = (byte) myChar;
        System.out.println(newByte + " is now a byte");
        short newShort = (short) myDouble;
        System.out.println(newShort + " is now a short");
        Integer newInt = (int) myShort;
        System.out.println(newInt + " is now a int");
        long newLong = myInt;
        System.out.println(newLong + " is now a long");
        float newFloat = (float) myLong;
        System.out.println(newFloat + " is now a float");
        double newDouble = myFloat;
        System.out.println(newDouble + " is now a double");
    }
}
