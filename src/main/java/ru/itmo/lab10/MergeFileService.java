package ru.itmo.lab10;

import ru.itmo.lab10.util.FileCreator;
import ru.itmo.lab10.util.FileGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Part 3
 */
public class MergeFileService {
    static Path mergeFiles(Path firstFile, Path secondFile) throws IOException {
        final Path mergeResult = FileCreator.createFileIfNotExists(System.nanoTime() + "_merge_result.txt");
        Files.writeString(mergeResult, FileReader.readText(firstFile), StandardOpenOption.APPEND);
        Files.writeString(mergeResult, FileReader.readText(secondFile), StandardOpenOption.APPEND);
        return mergeResult;
    }
}

class MergeFileServiceExample {
    public static void main(String[] args) throws IOException {
        final Path firstFile = FileGenerator.generateRandomFile(System.nanoTime() + "_first.txt");
        final Path secondFile = FileGenerator.generateRandomFile(System.nanoTime() + "_second.txt");

        MergeFileService.mergeFiles(firstFile, secondFile);
    }
}
