package ru.itmo.lab10.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreator {
    private static final String DATA_FOLDER_NAME = "data";

    public static Path createFileIfNotExists(String filename) throws IOException {
        if (!Files.exists(Paths.get(DATA_FOLDER_NAME, filename))) {
            Files.createFile(Paths.get(DATA_FOLDER_NAME, filename));
        }
        return Paths.get(DATA_FOLDER_NAME, filename);
    }

    public static void createDataFolderIfNotExists() throws IOException {
        if (!Files.exists(Paths.get(DATA_FOLDER_NAME))) {
            Files.createDirectory(Paths.get(DATA_FOLDER_NAME));
        }
    }
}
