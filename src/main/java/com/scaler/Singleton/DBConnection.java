package com.scaler.Singleton;

public class DBConnection {
    private String url;
    private String user;
    private String password;

    private static volatile DBConnection instance;

    private DBConnection(){}

    public static DBConnection getInstance(){
        if (instance == null){
            synchronized (DBConnection.class){
                if (instance == null){
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
// Use an enum solution for serialization problem with singleton
