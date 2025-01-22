package ru.itmo.lab4;

import java.util.Scanner;

/**
 * Part 3
 */
public class NumberSumResolver {
    static boolean isSumEqualsToNumber(long firstNumber, long secondNumber, long checkNumber) {
        return (firstNumber + secondNumber) == checkNumber;
    }
}

class SumNumbersExampleMain {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            final long firstNumber = scan.nextLong();

            System.out.print("Enter second number: ");
            final long secondNumber = scan.nextLong();

            System.out.print("Enter third number: ");
            final long checkNumber = scan.nextLong();

            System.out.printf("Result: %s %n", NumberSumResolver.isSumEqualsToNumber(
                    firstNumber, secondNumber, checkNumber));
        }
    }
}
