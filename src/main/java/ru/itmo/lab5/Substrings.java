package ru.itmo.lab5;

/**
 * Part 4
 */
public class Substrings {
    static int getSubstringsCount(String word, String source) {
        int substringCount = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == word.charAt(0) && isSubstring(word, source, i)) {
                substringCount++;
            }
        }

        return substringCount;
    }

    private static boolean isSubstring(String word, String source, int startIndex) {
        int index = 0;
        while (index < word.length() && (index + startIndex) < source.length()) {
            if (word.charAt(index) != source.charAt(index + startIndex)) {
                return false;
            }
            index++;
        }
        return index == word.length();
    }
}

class SubstringsExampleMain {
    public static void main(String[] args) {
        System.out.println(Substrings.getSubstringsCount("xx", "Some_xxx_xx_xxxx"));
    }
}
