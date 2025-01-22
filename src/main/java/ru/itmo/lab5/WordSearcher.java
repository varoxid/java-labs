package ru.itmo.lab5;

/**
 * Part 1
 */
public class WordSearcher {
    static String getLongestWord(String inputText) {
        final String[] words = inputText.split("\\W+");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}

class WordSearchExampleMain {
    public static void main(String[] args) {
        System.out.println(WordSearcher.getLongestWord("Some edf tesx ff! "));
    }
}
