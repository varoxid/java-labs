package ru.itmo.lab5;

/**
 * Part 2
 */
public class PalindromResolver {

    static boolean isPalindrom(String input) {
        final String source = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (source.charAt(left++) != source.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

class PalindromExampleMain {
    public static void main(String[] args) {
        System.out.println(PalindromResolver.isPalindrom("bbbb"));
        System.out.println(PalindromResolver.isPalindrom("bbab"));
        System.out.println(PalindromResolver.isPalindrom("b"));
        System.out.println(PalindromResolver.isPalindrom("fbBabbF"));
    }
}
