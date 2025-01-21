package ru.itmo.lab4;

import java.util.Scanner;

/**
 * Part 3
 */
public class NumberSumResolver {
    static void resolveNumbersSum() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter first number: ");

            final long firstNumber = scan.nextLong();

            System.out.print("Enter second number: ");

            final long secondNumber = scan.nextLong();

            System.out.print("Enter third number: ");

            final long thirdNumber = scan.nextLong();

            System.out.printf("Result: %s %n", (firstNumber + secondNumber) == thirdNumber);
        }
    }
}

class SumNumbersExampleMain {
    public static void main(String[] args) {
        NumberSumResolver.resolveNumbersSum();
    }
}
