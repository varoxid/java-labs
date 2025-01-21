package ru.itmo.lab4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Part 8
 */
public class ArrayPrinter {
    static void printArray() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Array length: ");

            final int arrayLength = scan.nextInt();
            final int[] array = new int[arrayLength];

            System.out.println("Numbers of array:");

            for (int i = 0; i < arrayLength; i++) {
                array[i] = scan.nextInt();
            }

            System.out.printf("Result: %s %n", Arrays.toString(array));
        }
    }
}

class PrintArrayExampleMain {
    public static void main(String[] args) {
        ArrayPrinter.printArray();
    }
}
