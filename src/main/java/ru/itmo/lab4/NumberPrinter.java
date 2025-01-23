package ru.itmo.lab4;

/**
 * Part 1, Part 2
 */
public class NumberPrinter {

    static void printOddNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    static void printNumbers(int from, int to) {
        for (int i = from; i <= to; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Divide by 3 and 5: %s %n", i);
            } else if (i % 3 == 0) {
                System.out.printf("Divide by 3: %s %n", i);
            } else if (i % 5 == 0) {
                System.out.printf("Divide by 5: %s %n", i);
            }
        }
    }
}

class PrintNumbersExampleMain {
    public static void main(String[] args) {
        NumberPrinter.printOddNumbers(1, 99);
        NumberPrinter.printNumbers(1, 100);
    }
}
