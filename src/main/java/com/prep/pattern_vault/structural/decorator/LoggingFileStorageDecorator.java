package com.prep.pattern_vault.structural.decorator;

public class LoggingFileStorageDecorator extends FileStorageDecorator {

    public LoggingFileStorageDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public String store(String filename, byte[] content) {
        System.out.printf("Started logging the process ---- \n");
        try {
            fileStorage.store(filename,content);
        } catch (RuntimeException exception){
            throw new RuntimeException("Couldn't complete the process");
        }
        return String.format("logs from file %s - \n", filename);
    }
}
