package ru.itmo.lab10.util;

import ru.itmo.lab10.FileWriter;

import java.io.IOException;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileGenerator {
    public static Path generateRandomFile(String filename) throws IOException {
        return FileWriter.writeFile(filename, generateText(filename));
    }

    private static String generateText(String filename) {
        return IntStream.range(1, ThreadLocalRandom.current().nextInt(20))
                .mapToObj(lineNumber ->
                        String.format("[%s]: %s with content %s!", filename, lineNumber, System.nanoTime()))
                .collect(Collectors.joining("\n"));
    }
}
