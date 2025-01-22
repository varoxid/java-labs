package ru.itmo.lab5;

/**
 * Part 3
 */
public class Censor {

    static String doCensor(String input, String regex, String replacement) {
        return input.replaceAll(regex, replacement);
    }
}

class CensorExampleMain {
    public static void main(String[] args) {
        System.out.println(Censor.doCensor("Some text with bad words and notbad", "\\bbad\\b", "[censored]"));
    }
}
