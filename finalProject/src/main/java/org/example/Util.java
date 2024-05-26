package org.example;

public class Util {
    /**
     * Changes the String to titleCase
     *
     * @param strIn the String
     * @return the String in titleCase
     */
    public static String toTitleCase(String strIn) {
        String firstCharacter = strIn.substring(0, 1).toUpperCase();
        String remaining = strIn.substring(1).toLowerCase();
        String firstWord = firstCharacter + remaining;

        int word2 = (strIn.indexOf(" "));
        String firstCharacter2 = strIn.substring(word2 + 1, word2 + 2).toUpperCase();
        String remaining2 = strIn.substring(word2 + 2).toLowerCase();
        String secondWord = firstCharacter2 + remaining2;
        return firstWord + secondWord;
    }
}
