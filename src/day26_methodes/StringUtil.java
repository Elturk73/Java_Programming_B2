package day26_methodes;

public class StringUtil {

    /**
     * This method reveses the given String
     *
     * @return reversed version
     */
    public static String reverse(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }


    /**
     * This method is finding how many times given character exists in given String
     *
     * @return the number of the existence
     * Made by @Feyruz
     */
    public static int frequencyOfCharacters(String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}