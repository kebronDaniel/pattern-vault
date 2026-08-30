package com.prep.pattern_vault.structural.decorator;

public abstract class FileStorageDecorator implements FileStorage {

    protected final FileStorage fileStorage;

    protected FileStorageDecorator(FileStorage fileStorage) {
        this.fileStorage = fileStorage;
    }
}
