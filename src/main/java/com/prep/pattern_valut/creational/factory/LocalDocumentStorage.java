package com.prep.pattern_valut.creational.factory;

public class LocalDocumentStorage implements DocumentStorage {
    @Override
    public String store(Document document) {
        return String.format("/files/%s",document.fileName());
    }
}
