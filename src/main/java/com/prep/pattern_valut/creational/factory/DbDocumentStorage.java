package com.prep.pattern_valut.creational.factory;

public class DbDocumentStorage implements DocumentStorage {

    @Override
    public String store(Document document) {
        return String.format("database-%s",document.fileName());
    }
}
