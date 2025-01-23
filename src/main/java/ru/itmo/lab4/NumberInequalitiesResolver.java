package ru.itmo.lab4;

import java.util.Scanner;

/**
 * Part 4
 */
public class NumberInequalitiesResolver {
    static boolean isIncreasingInequality(long firstNumber, long secondNumber, long thirdNumber) {
        return (secondNumber > firstNumber) && (thirdNumber > secondNumber);
    }
}

class NumbersExampleMain {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            final long firstNumber = scan.nextLong();

            System.out.print("Enter second number: ");
            final long secondNumber = scan.nextLong();

            System.out.print("Enter third number: ");
            final long thirdNumber = scan.nextLong();

            System.out.printf("Result: %s %n", NumberInequalitiesResolver.isIncreasingInequality(
                    firstNumber, secondNumber, thirdNumber));
        }
    }
}
