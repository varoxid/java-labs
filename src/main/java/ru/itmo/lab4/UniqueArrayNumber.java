package ru.itmo.lab4;

import java.util.HashMap;
import java.util.Map;

/**
 * Part 10
 */
public class UniqueArrayNumber {
    static int findUnique(int[] array) {
        final Map<Integer, Integer> numberCount = new HashMap<>();
        for (int number : array) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }

        for (int number : array) {
            if (numberCount.get(number) == 1) {
                return number;
            }
        }

        throw new IllegalStateException("No unique numbers");
    }
}

class UniqueNumberExampleMain {
    public static void main(String[] args) {
        System.out.println(UniqueArrayNumber.findUnique(new int[]{1, 2, 3, 1, 2, 4}));
    }
}
