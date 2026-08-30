package com.prep.pattern_vault.structural.decorator;

public class LoggingFileStorageDecorator extends FileStorageDecorator {

    public LoggingFileStorageDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public String store(String filename, byte[] content) {
        System.out.printf("Started logging the process ---- \n");
        String result;
        try {
            result = fileStorage.store(filename,content);
        } catch (RuntimeException exception){
            throw new RuntimeException("Couldn't complete the process", exception);
        }
        System.out.printf("logs from file %s - \n", filename);
        return result;
    }
}
