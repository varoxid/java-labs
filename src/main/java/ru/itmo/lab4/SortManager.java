package ru.itmo.lab4;

/**
 * Part 7
 */
public class SortManager {
    static boolean isSorted(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Invalid array");
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

class SortManagerExample {
    public static void main(String[] args) {
        System.out.println(SortManager.isSorted(new int[]{1, 2, 3, 4}) ? "OK" : "Please, try again");
    }
}
