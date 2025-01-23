package ru.itmo.lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Part 3
 * selection for ArrayList O(1)
 * selection for LinkedList O(N)
 */
class ListComparing {

    static void printRandomSelectionTime(List<Integer> inputList, int elementsCount, int selectionCount) {
        for (int i = 0; i < elementsCount; i++) {
            inputList.add(ThreadLocalRandom.current().nextInt(100));
        }

        long start = System.nanoTime();
        for (int i = 0; i < selectionCount; i++) {
            inputList.get(ThreadLocalRandom.current().nextInt(100));
        }
        System.out.printf("Result time for %s:\t %s %n", inputList.getClass(), System.nanoTime() - start);
    }
}

class ListComparingExampleMain {
    public static void main(String[] args) {
        ListComparing.printRandomSelectionTime(new ArrayList<>(), 1_000_000, 100_000);
        ListComparing.printRandomSelectionTime(new LinkedList<>(), 1_000_000, 100_000);
    }
}

