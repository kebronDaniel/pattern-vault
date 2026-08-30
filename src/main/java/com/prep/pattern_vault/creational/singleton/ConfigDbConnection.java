package com.prep.pattern_vault.creational.singleton;

public class ConfigDbConnection {
    private final int connectionPoolSize;
    private final String username;
    private final String connectionParams;
    private int instanceCounter;

    private static volatile ConfigDbConnection configDbConnection;

    private ConfigDbConnection() {
        this.connectionPoolSize = 10;
        this.username = "username";
        this.connectionParams = "jdbc:postgresql://localhost:5432/mydb";
        instanceCounter++;
    }

    public static synchronized ConfigDbConnection getInstance(){
        if (configDbConnection == null) configDbConnection = new ConfigDbConnection();
        return configDbConnection;
    }

    public int getConnectionPoolSize() {
        return connectionPoolSize;
    }

    public String getUsername() {
        return username;
    }

    public String getConnectionParams() {
        return connectionParams;
    }

    public int getInstanceCounter() {
        return instanceCounter;
    }
}
