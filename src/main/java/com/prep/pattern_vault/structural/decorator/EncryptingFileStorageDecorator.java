package com.prep.pattern_vault.structural.decorator;

public class EncryptingFileStorageDecorator extends FileStorageDecorator {

    // toy XOR cipher for illustration only - not suitable for real encryption.
    private static final byte KEY = (byte) 0x5A;

    public EncryptingFileStorageDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public String store(String filename, byte[] content) {
        System.out.printf("Started to encrypt a file - %s \n",filename);
        byte[] encrypted = encrypt(content);
        try {
            return fileStorage.store(filename,encrypted);
        } catch (RuntimeException exception){
            throw new RuntimeException("Could not complete the process", exception);
        }
    }

    private byte[] encrypt(byte[] content){
        byte[] encrypted = new byte[content.length];
        for (int i = 0; i < content.length; i++) {
            encrypted[i] = (byte) (content[i] ^ KEY);
        }
        return encrypted;
    }
}
