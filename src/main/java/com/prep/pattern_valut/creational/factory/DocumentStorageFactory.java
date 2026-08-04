package com.prep.pattern_valut.creational.factory;

public class DocumentStorageFactory {
    // can use a simple switch statement to create based on the type.
    // or you can have a registry and use the type to resolve and return the object
    public DocumentStorage create(StorageType type){
        return type.create();
    }
}
