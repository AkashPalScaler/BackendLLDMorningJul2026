package com.scaler.Uber;

public class Fare {
    private Integer baseCharge;
    private Double surchargeMultiplier;

    public Fare() {
    }

    public Fare(Integer baseCharge, Double surchargeMultiplier) {
        this.baseCharge = baseCharge;
        this.surchargeMultiplier = surchargeMultiplier;
    }

    public Fare(Fare fare) {
        this.baseCharge = fare.baseCharge;
        this.surchargeMultiplier = fare.surchargeMultiplier;
    }

    public Integer getBaseCharge() {
        return baseCharge;
    }

    public void setBaseCharge(Integer baseCharge) {
        this.baseCharge = baseCharge;
    }

    public Double getSurchargeMultiplier() {
        return surchargeMultiplier;
    }

    public void setSurchargeMultiplier(Double surchargeMultiplier) {
        this.surchargeMultiplier = surchargeMultiplier;
    }
}
