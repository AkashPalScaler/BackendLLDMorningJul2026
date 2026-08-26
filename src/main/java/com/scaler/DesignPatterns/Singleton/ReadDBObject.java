package com.scaler.DesignPatterns.Singleton;

public class ReadDBObject implements Runnable{
    @Override
    public void run() {
        DBConnection db =  DBConnection.getInstance();
        System.out.println(db);
    }
}
