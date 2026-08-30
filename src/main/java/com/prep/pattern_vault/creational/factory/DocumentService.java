package com.prep.pattern_vault.creational.factory;

public class DocumentService {

    private final DocumentStorageFactory storageFactory;

    public DocumentService(DocumentStorageFactory storageFactory) {
        this.storageFactory = storageFactory;
    }

    public String upload(StorageType type, Document document){
        return storageFactory.create(type).store(document);
    }
}
