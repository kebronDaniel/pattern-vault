package com.prep.pattern_vault.creational.singleton;

public enum ResourceProvision {
    GET_RESOURCE(10,"resourceParam");

    private final int resource_size;
    private final String resourceParams;
    private int instanceCounter;

    ResourceProvision(int resource_size, String resourceParams) {
        this.resource_size = resource_size;
        this.resourceParams = resourceParams;
        instanceCounter++;
    }

    public int getResource_size() {
        return resource_size;
    }

    public String getResourceParams() {
        return resourceParams;
    }

    public int getInstanceCounter() {
        return instanceCounter;
    }
}
