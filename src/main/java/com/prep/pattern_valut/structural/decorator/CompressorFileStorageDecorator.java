package com.prep.pattern_valut.structural.decorator;

public class CompressorFileStorageDecorator extends FileStorageDecorator
{
    public CompressorFileStorageDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public String store(String filename, byte[] content) {
        System.out.printf("Started to compress a file - %s \n",filename);
        compress(content);
        try {
            return fileStorage.store(filename,content);
        } catch (RuntimeException exception){
            throw new RuntimeException("Could not complete the process");
        }
    }

    private void compress(byte[] content){
        // implement
        System.out.println("Compressed the content");
    }
}
