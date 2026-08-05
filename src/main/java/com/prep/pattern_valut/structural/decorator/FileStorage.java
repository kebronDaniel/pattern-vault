package com.prep.pattern_valut.structural.decorator;

public interface FileStorage {
    String store(String filename, byte[] content);
}
