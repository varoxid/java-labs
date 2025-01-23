package ru.itmo.lab10;

import ru.itmo.lab10.util.FileGenerator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Part 4
 */
public class FileReplacer {
    static void replace(Path file, String replacement) throws IOException {
        final String replace = FileReader.readText(file).replaceAll("[^a-zA-Z0-9\\n]", replacement);
        FileWriter.writeFile(file.getFileName().toString(), replace, StandardOpenOption.TRUNCATE_EXISTING);
    }
}

class FileReplacerExampleMain {
    public static void main(String[] args) throws IOException {
        final Path file = FileGenerator.generateRandomFile(System.nanoTime() + "_replace.txt");
        FileReplacer.replace(file, "\\$");
    }
}
