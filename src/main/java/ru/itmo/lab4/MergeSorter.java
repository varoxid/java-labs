package ru.itmo.lab4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Part 11
 */
public class MergeSorter {
    static void mergeSort(int[] array, int arrayLength) {
        if (array == null) {
            throw new IllegalArgumentException("Invalid array");
        }

        if (array.length < 2) {
            return;
        }

        int middle = arrayLength / 2;
        int[] leftArrayPart = new int[middle];
        int[] rightArrayPart = new int[arrayLength - middle];

        System.arraycopy(array, 0, leftArrayPart, 0, middle);

        if (arrayLength - middle >= 0) {
            System.arraycopy(array, middle, rightArrayPart, 0, arrayLength - middle);
        }

        mergeSort(leftArrayPart, middle);
        mergeSort(rightArrayPart, arrayLength - middle);

        merge(array, leftArrayPart, rightArrayPart, middle, arrayLength - middle);
    }

    private static void merge(int[] array, int[] leftArrayPart, int[] rightArrayPart, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftArrayPart[i] <= rightArrayPart[j]) {
                array[k++] = leftArrayPart[i++];
            } else {
                array[k++] = rightArrayPart[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArrayPart[i++];
        }
        while (j < right) {
            array[k++] = rightArrayPart[j++];
        }
    }
}

class ArrayGenerator {
    static int[] generate(int length) {
        final int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = ThreadLocalRandom.current().nextInt(100);
        }
        return result;
    }
}

class MergeSortExampleMain {
    public static void main(String[] args) {
        final int arrayLength = 10;
        final int[] array = ArrayGenerator.generate(arrayLength);
        MergeSorter.mergeSort(array, arrayLength);
        System.out.println(Arrays.toString(array));
    }
}
