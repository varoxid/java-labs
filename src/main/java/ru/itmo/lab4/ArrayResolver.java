package ru.itmo.lab4;

import java.util.Arrays;
import java.util.Set;

/**
 * Part 5, Part 6
 */
public class ArrayResolver {

    static boolean isContainsEdgeNumber(int[] array, int edgeNumber) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        return array[0] == edgeNumber && array[array.length - 1] == edgeNumber;
    }

    static boolean containsInArray(int[] array, Set<Integer> numbers) {
        return Arrays.stream(array).anyMatch(numbers::contains);
    }
}

class ArrayExampleMain {
    public static void main(String[] args) {
        System.out.println(ArrayResolver.isContainsEdgeNumber(new int[]{3, -3, 7, 4, 5, 4, 3}, 3));
        System.out.println(ArrayResolver.containsInArray(new int[]{3, -3, 7, 4, 5, 4, 3}, Set.of(1, 3)));
        System.out.println(ArrayResolver.containsInArray(new int[]{0, -3, 7, 4, 5, 4, 0}, Set.of(1, 3)));
    }
}
