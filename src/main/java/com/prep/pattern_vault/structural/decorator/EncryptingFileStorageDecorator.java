package com.prep.pattern_vault.structural.decorator;

public class EncryptingFileStorageDecorator extends FileStorageDecorator {
    public EncryptingFileStorageDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public String store(String filename, byte[] content) {
        System.out.printf("Started to encrypt a file - %s \n",filename);
        encrypt(content);
        try {
            return fileStorage.store(filename,content);
        } catch (RuntimeException exception){
            throw new RuntimeException("Could not complete the process");
        }
    }

    private void encrypt(byte[] content){
        System.out.println("Encrypted the content");
    }
}
