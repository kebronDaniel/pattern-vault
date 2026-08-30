package com.prep.pattern_vault.creational.factory;

public class LocalDocumentStorage implements DocumentStorage {
    @Override
    public String store(Document document) {
        return String.format("/files/%s",document.fileName());
    }
}
