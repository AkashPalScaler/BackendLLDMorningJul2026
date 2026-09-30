package com.scaler.ParkingLot.Models;

import java.util.Date;

public class Ticket extends BaseModel {
    private String number;
    private Date entryTime;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
