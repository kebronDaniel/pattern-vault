package com.prep.pattern_valut.structural.decorator;

public class LocalFileStorage implements FileStorage {
    @Override
    public String store(String filename, byte[] content) {
        System.out.println("Started saving the file to local storage");
        return String.format("stored %s in local files \n", filename);
    }
}
