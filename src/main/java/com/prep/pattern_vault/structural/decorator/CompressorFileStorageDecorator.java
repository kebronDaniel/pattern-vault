package com.prep.pattern_vault.structural.decorator;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

public class CompressorFileStorageDecorator extends FileStorageDecorator
{
    public CompressorFileStorageDecorator(FileStorage fileStorage) {
        super(fileStorage);
    }

    @Override
    public String store(String filename, byte[] content) {
        System.out.printf("Started to compress a file - %s \n",filename);
        byte[] compressed = compress(content);
        try {
            return fileStorage.store(filename,compressed);
        } catch (RuntimeException exception){
            throw new RuntimeException("Could not complete the process", exception);
        }
    }

    private byte[] compress(byte[] content){
        var byteStream = new ByteArrayOutputStream();
        try (var deflaterStream = new DeflaterOutputStream(byteStream, new Deflater(Deflater.BEST_COMPRESSION))) {
            deflaterStream.write(content);
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
        return byteStream.toByteArray();
    }
}
