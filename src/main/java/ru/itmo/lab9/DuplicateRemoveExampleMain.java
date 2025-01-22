package ru.itmo.lab9;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Part 2
 */
class DuplicateRemover {
    static <T> Set<T> removeDuplicates(Collection<T> inputCollection) {
        return new HashSet<>(inputCollection);
    }
}

class DuplicateRemoveExampleMain {
    public static void main(String[] args) {
        System.out.println(DuplicateRemover.removeDuplicates(Arrays.asList("1", "2", "1", "3", "3", "4")));
    }
}
