package com.prep.pattern_valut.structural.decorator;

public abstract class FileStorageDecorator implements FileStorage {

    protected final FileStorage fileStorage;

    protected FileStorageDecorator(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }
}
