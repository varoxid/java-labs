package ru.itmo.lab1;

/**
 * Part 1
 */
public class SimplePrinter {
    public static void main(String[] args) {
        print("I", "know", "Java", "well");
    }

    private static void print(String... printItems) {
        for (String printItem : printItems) {
            System.out.println(printItem);
        }
    }
}
