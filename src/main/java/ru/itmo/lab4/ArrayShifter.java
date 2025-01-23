package ru.itmo.lab4;

import java.util.Arrays;

/**
 * Part 9
 */
public class ArrayShifter {
    static void shiftEdges(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }

        int head = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = head;
    }
}

class ShiftArrayExampleMain {
    public static void main(String[] args) {
        final int[] array = new int[]{5, 6, 7, 2};
        System.out.printf("Array 1: %s %n", Arrays.toString(array));

        ArrayShifter.shiftEdges(array);

        System.out.printf("Array 2: %s %n", Arrays.toString(array));
    }
}
