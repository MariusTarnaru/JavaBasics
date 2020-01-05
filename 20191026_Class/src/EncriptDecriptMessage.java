public class EncriptDecriptMessage {

    public static String encrypt(String message, int deviation) {
        String encryptedMessage = "";

        // parcurg mesajul caracater cu caracter
        for (int i = 0; i < message.length(); i++) {

            // iau caracterul de la indexul i
            char currentChar = message.charAt(i);
            // determin daca trebuie sa aplic deviere pe acest caracter
            if (Character.isLetter(currentChar)) {
                // fac casting la int
                int currentCharIntValue = (int) currentChar;
                // aplic devierea
                currentCharIntValue = currentCharIntValue + deviation;
                // daca am depasit valorea maxima - scad numarul de litere din alfabet
                if (currentCharIntValue > 122) {
                    // number of letters in english alphabet
                    currentCharIntValue = currentCharIntValue - 26;
                }
                // fac casting inapoi la char
                char newChar = (char) currentCharIntValue;
                // concatenate the new char to the message
                encryptedMessage = encryptedMessage + newChar;
            } else {
                encryptedMessage = encryptedMessage + currentChar;
            }
        }

        return encryptedMessage;
    }

    public static String decrypt(String message, int deviation) {
        String decryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char currentCharacter = message.charAt(i);
            if (Character.isLetter(currentCharacter)) {
//                currentCharacter = currentCharacter - deviation;
//                currentCharacter++;
//                currentCharacter = (char)((int)currentCharacter - deviation);
                int currentCharacterIntValue = (int) currentCharacter;
                currentCharacterIntValue = currentCharacterIntValue - deviation;

                if (currentCharacterIntValue < 97) {
                    currentCharacterIntValue = currentCharacterIntValue + 26;
                }

                decryptedMessage = decryptedMessage + (char) currentCharacterIntValue;
            } else {
                decryptedMessage = decryptedMessage + currentCharacter;
            }
        }

        return decryptedMessage;
    }

    public static void main(String[] args) {
        String message = "a very beautiful message.";
        System.out.println(message);
        String encryptedMessage = encrypt(message, 5);
        System.out.println(encryptedMessage);
        for (int i = 1; i <= 26; i++) {
            String decryptedMessage = decrypt(encryptedMessage, i);
            System.out.println(decryptedMessage);
        }

        char c = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(c);
            c++;
        }
        if(c >= 'z'){
            System.out.println("am ajuns la limita superioara a literelor mici");
        }

    }

}
