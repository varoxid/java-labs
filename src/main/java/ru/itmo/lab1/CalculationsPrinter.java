package ru.itmo.lab1;

/**
 * Part 2, Part 3, Part 4
 */
public class CalculationsPrinter {
    public static void main(String[] args) {
        printCalculation1();
        printCalculation2();
        printCalculation3();
    }

    private static void printCalculation1() {
        System.out.println((46 + 10) * ((double) 10 / 3));
        System.out.println(29 * 4 * (-15));
    }

    private static void printCalculation2() {
        int number = 10500;
        System.out.println((number / 10) / 10);
    }

    private static void printCalculation3() {
        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
    }
}
