package com.prep.pattern_vault.creational.singleton;

public enum ResourceProvision {
    GET_RESOURCE(10,"resourceParam");

    private final int resourceSize;
    private final String resourceParams;

    ResourceProvision(int resourceSize, String resourceParams) {
        this.resourceSize = resourceSize;
        this.resourceParams = resourceParams;
    }

    public int getResourceSize() {
        return resourceSize;
    }

    public String getResourceParams() {
        return resourceParams;
    }
}
