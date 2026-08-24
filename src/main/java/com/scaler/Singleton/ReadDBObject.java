package com.scaler.Singleton;

import java.io.Serializable;

public class ReadDBObject implements Runnable{
    @Override
    public void run() {
        DBConnection db =  DBConnection.getInstance();
        System.out.println(db);
    }
}
