public class Primitives {

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        byte x1 = 67;
        x1 = 127;
        System.out.println(x1);
        x1++;
        System.out.println(x1);

        for(byte x2 = 120; x2 > 10 || x2 < -120; x2++){
            System.out.println(x2);
        }

        short s1 = 16454;
        System.out.println(s1);

        int i1 = 34234324;
        System.out.println(i1);

        long l1 = 4545354353423433L;
        System.out.println(l1);

        float f1 = 24;
        f1 = 24.5F;
        System.out.println(f1);

        double d1 = 324234.32443;
        System.out.println(d1);

        char c1 = 'a';
        System.out.println(c1);
        for (char c2 = 'a'; c2 <= 'z'; c2++){
            System.out.print(c2 + " ");
        }

        char c2 = '?';
        System.out.println(c2);
        System.out.println((int)c2);

        char c3 = '\u0F3A';
        System.out.println(c3);

        for (int i = 0; i < 10; i++) {
            System.out.println((char)(c3 + i));
        }

        int intPlusValue = s1 + 7;
        System.out.println(intPlusValue);
        int xi1 = s1;
        int xi2 = x1;
        short shortCasting = (short)intPlusValue;

        long longSubtraction = l1 - i1;
        int intLongSubtraction = (int)(l1 - i1);
        System.out.println(l1 - i1);

        char c4 = 95;
        System.out.println(c4);
        System.out.println((int)c4);

        int bigInt = 545334435;
        float bigFloat = (float)bigInt;
        System.out.println(bigFloat);

        int notSoBigInt = 324;
        float notSoBigFloat = (float)notSoBigInt;
        System.out.println(notSoBigFloat);

        short someShort = 135;
        byte someByte = (byte)someShort;
        System.out.println(someByte);

        // byte -128 ... 127







    }

}
