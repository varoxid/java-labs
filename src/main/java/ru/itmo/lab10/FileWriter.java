package ru.itmo.lab10;

import ru.itmo.lab10.util.FileCreator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Part 2
 */
public class FileWriter {
    public static Path writeFile(String filename, String text) throws IOException {
        return write(filename, text, StandardOpenOption.APPEND);
    }

    public static Path writeFile(String filename, String text, StandardOpenOption fileOption) throws IOException {
        return write(filename, text, fileOption);
    }

    private static Path write(String filename, String text, StandardOpenOption fileOption) throws IOException {
        FileCreator.createDataFolderIfNotExists();
        final Path existedPath = FileCreator.createFileIfNotExists(filename);
        Files.writeString(existedPath, text, fileOption);
        return existedPath;
    }
}

class FileWriterExampleMain {
    public static void main(String[] args) throws IOException {
        FileWriter.writeFile("example.txt", "test\n");
    }
}
