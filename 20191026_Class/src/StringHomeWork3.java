public class StringHomeWork3 {

    public static String reverseString(String message) {
        String out = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            out = out + message.charAt(i);
            System.out.println(out);
        }
        return out;
    }

    public static String reverseString2(String message) {
        String out = "";
        for (int i = 0; i < message.length(); i++) {
            out = message.charAt(i) + out;
            System.out.println(out);
        }
        return out;
    }

    public static void main(String[] args) {
        String message = "Hello World";

        for (int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }

        for (int i = 0; i < message.length(); i++) {
            int charIntValue = (int) message.charAt(i);
            System.out.print(charIntValue + " ");
        }
        System.out.println();

        System.out.println(reverseString(message));
        System.out.println(reverseString2(message));

        message = "ABCDEFGHIJ";
        message = message.toLowerCase();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int countVowels = 0;

        for (int i = 0; i < message.length(); i++) {

            boolean found = false;

            int j = 0;
            while (j < vowels.length && found == false) {
                if (message.charAt(i) == vowels[j]) {
                    found = true;
                }
                j++;
            }

            if (found) {
                countVowels++;
            }
        }

        System.out.println(countVowels);

        String hb = "Happy Birthday ? !";
        String[] names = {"Jimmy", "Maria", "Alex"};
        int indexOfQuestionMark = hb.indexOf("?");
        if (indexOfQuestionMark >= 0) {
            for (int i = 0; i < names.length; i++) {
//            System.out.println(hb.replace("?", names[i]));
                String firstPart = hb.substring(0, indexOfQuestionMark);
                String lastPart = hb.substring(indexOfQuestionMark + 1);
                String fullMessage = firstPart + names[i] + lastPart;
                System.out.println(fullMessage);
            }
        }

    }

}
