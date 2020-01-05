public class Test {

    public static void main(String[] args) {

        String x = "abc-def";
        String a = "Buna Ziua ! Lumeeee.";
        System.out.println(x.substring(x.indexOf("-")));                // afiseaza -def
        System.out.println(x.substring(x.indexOf("-") + 1));            // afiseaza def
        System.out.println(x.substring(x.indexOf("-") + 1, x.length())); //afiseaza def
        System.out.println(a.substring(a.indexOf("!")));
        System.out.println(a.substring(a.indexOf("!") + 1));
        System.out.println(a.substring(a.indexOf("Z")));


    }

}
