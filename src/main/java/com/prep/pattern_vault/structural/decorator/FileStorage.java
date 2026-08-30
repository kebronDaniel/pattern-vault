package com.prep.pattern_vault.structural.decorator;

public interface FileStorage {
    String store(String filename, byte[] content);
}
