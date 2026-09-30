package com.scaler.ParkingLot.DTOs;

import com.scaler.ParkingLot.Models.Operator;

public class IssueTicketRequestDTO {
//    private Long parkingLotId; // We can get this from operator
    private Long operatorId;
    private String registrationNumber;
    private String ownerName;
    private String ownerNumber;

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerNumber() {
        return ownerNumber;
    }

    public void setOwnerNumber(String ownerNumber) {
        this.ownerNumber = ownerNumber;
    }
}
