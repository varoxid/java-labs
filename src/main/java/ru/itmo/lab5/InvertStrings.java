package ru.itmo.lab5;

/**
 * Part 5
 */
public class InvertStrings {

    static String invert(String inputText) {
        char[] inputChars = inputText.toCharArray();

        int left = 0;
        int right = inputChars.length - 1;

        while (left < right) {
            char tmp = inputChars[left];
            inputChars[left++] = inputChars[right];
            inputChars[right--] = tmp;
        }
        final String[] splitInverted = new String(inputChars).split(" ");
        final StringBuilder result = new StringBuilder();
        for (int i = splitInverted.length - 1; i >= 0; i--) {
            result.append(splitInverted[i]).append(" ");
        }
        return result.toString().trim();
    }
}

class InvertStringsExampleMain {
    public static void main(String[] args) {
        System.out.println(InvertStrings.invert("This is a test string"));
    }
}
