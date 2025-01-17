package ru.itmo.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Part 5, Part 6
 */
public class NumberResolver {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            final List<Integer> inputNumbers = new ArrayList<>();
            while (scan.hasNextInt()) {
                inputNumbers.add(scan.nextInt());
            }
            inputNumbers.forEach(System.out::println);

            resolvedNumbers(inputNumbers).forEach(System.out::println);
        }
    }

    private static List<String> resolvedNumbers(List<Integer> inputNumbers) {
        return inputNumbers
                .stream()
                .map(number -> {
                    if (number % 2 == 0) {
                        return number > 100 ? "Out of bound" : "Even";
                    }
                    return "Odd";
                })
                .toList();
    }
}
