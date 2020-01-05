public class Strings {

    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(message);

        String s = "Ana are mere. Radu are pere.";
        System.out.println(s);

        //length
        System.out.println("length:");
        System.out.println(s.length());
        System.out.println("abc".length());
        System.out.println("".length());
        //toLowerCase
        System.out.println("to lower case");
        System.out.println(s.toLowerCase());
        //toUpperCase
        System.out.println("to upper case");
        System.out.println(s.toUpperCase());
        //indexOf
        System.out.println("index of");
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('A'));
        System.out.println(s.indexOf("are"));
        // this will return -1
        System.out.println(s.indexOf("z"));
        //lastIndexOf
        System.out.println("last index of");
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.lastIndexOf("ere"));
        //charAt
        System.out.println("char at");
        System.out.println(s.charAt(8));
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(27));
        //concat
        System.out.println("concat");
        System.out.println(s.concat(" Mihai are portocale."));
        System.out.println(s + " Mihai are portocale.");
        //isEmpty
        System.out.println("is empty");
        System.out.println(s.isEmpty());
        System.out.println("####".isEmpty());
        System.out.println("".isEmpty());
        //trim
        System.out.println("trim");
        String s2 = "  Alexandru       ";
        System.out.println(s2);
        // trim eliminates heading and trailing spaces
        System.out.println(s2.trim());
        //substring
        System.out.println("substring");
        System.out.println(s.substring(14));
        System.out.println(s.substring(14, s.length()));
        System.out.println(s.substring(14, 28));
        System.out.println(s.substring(s.indexOf('R')));
        System.out.println(s.substring(14, 18));

        //replace
        System.out.println(s.replace("A", "I"));
        System.out.println(s.replace(" ", "_"));

        System.out.println(s);

        // we need to use = to set the new value for s
        s = s + " Mihai are portocale.";
        System.out.println(s);
//        same thing as
//        int a = 5;
//        System.out.println(a + 1);
//        a = a + 1;

        String alpha = "ab";
        alpha = alpha + "c";
        alpha = alpha + "d";
        System.out.println(alpha);

        System.out.println("equals:");
        String beta = "abcd";
        System.out.println(alpha == beta);
        System.out.println(alpha.equals(beta));

        String gamma = "abcd";
        System.out.println(beta == gamma);
        gamma = beta + "e";
        System.out.println(gamma);
        System.out.println("never compare strings with == !!!!!!");

    }
}
