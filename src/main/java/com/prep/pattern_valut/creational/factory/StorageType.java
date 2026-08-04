package com.prep.pattern_valut.creational.factory;

public enum StorageType {
    LOCAL {
        @Override
        public DocumentStorage create() {
            return new LocalDocumentStorage();
        }
    },
    S3 {
        @Override
        public DocumentStorage create() {
            return new S3DocumentStorage();
        }
    },
    DB {
        @Override
        public DocumentStorage create() {
            return new DbDocumentStorage();
        }
    };

    public abstract DocumentStorage create();
}
