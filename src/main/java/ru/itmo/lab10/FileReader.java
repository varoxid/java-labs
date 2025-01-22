package ru.itmo.lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Part 1
 */
public class FileReader {

    static String readText(Path path) throws IOException {
        return Files.readString(path);
    }

    static List<String> readFileLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }

    static List<String> readFileLines(String path)
            throws IOException {
        final List<String> lines = new ArrayList<>();
        try (final BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(FileReader.class.getResourceAsStream(path)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}

class FileReaderExample {
    public static void main(String[] args) throws IOException {
        System.out.println(FileReader.readText(Paths.get("src/main/resources/input.txt")));
        System.out.println(FileReader.readFileLines("/input.txt"));
    }
}
