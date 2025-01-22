package ru.itmo.lab2;

/**
 * Part 1
 */
class Calculator {

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static long sum(long number1, long number2) {
        return number1 + number2;
    }

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static long subtract(long number1, long number2) {
        return number1 - number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static long multiply(long number1, long number2) {
        return number1 * number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(int number1, int number2) {
        return (double) number1 / number2;
    }

    public static double divide(long number1, long number2) {
        return (double) number1 / number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(1,2));
        System.out.println(Calculator.sum(100L,200L));
        System.out.println(Calculator.sum(10,10.9));

        System.out.println(Calculator.subtract(1,2));
        System.out.println(Calculator.subtract(100L,200L));
        System.out.println(Calculator.subtract(10,10.9));

        System.out.println(Calculator.multiply(1,2));
        System.out.println(Calculator.multiply(10000L,200000L));
        System.out.println(Calculator.multiply(10.9,111));

        System.out.println(Calculator.divide(1,2));
        System.out.println(Calculator.divide(100L,200L));
        System.out.println(Calculator.divide(10.9,111));
    }
}
