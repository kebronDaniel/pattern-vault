package com.prep.pattern_vault.creational.factory;

public class S3DocumentStorage implements DocumentStorage {
    @Override
    public String store(Document document) {
        return String.format("s3://documents/%s", document.fileName());
    }
}
