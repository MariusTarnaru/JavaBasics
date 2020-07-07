package String;

public class StringToUppercase {

    public static void main(String[] args) {
        String string = "i have  101 Java code !";
        System.out.println(to_upper(string.toCharArray()));
        String myString = "i have  much more Java code !";
        System.out.println(myString.toUpperCase());
    }
    static String to_upper(char[] in){
        for (int i = 0; i < in.length; i++) {
            if ('a' <= in[i] && in[i] <= 'z'){
                in[i] = (char) (in[i] -'a' + 'A');
            }
        }
        return String.valueOf(in);
    }
}
