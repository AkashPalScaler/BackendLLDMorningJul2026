package com.scaler.Uber;

public class Main {
    public static void main(String[] args) {
        Driver d = new Driver("Aaksh", "0987873");
        d.setOnline();
        String maskedPhone = d.getMaskedPhone();
        Fare fare = new Fare(100, 1.5);
        Trip trip = new Trip("1", "KP", "Hadapsar", fare);
        // Shallow copy
        Trip trip3 =  trip;
        // Deep copy
        Trip trip2 = new Trip();
        trip2.setTripId(trip.getTripId());
        trip2.setSource(trip.getSource());
        trip2.setDestination(trip.getDestination());
        Fare fare2 = new Fare();
        fare2.setBaseCharge(fare.getBaseCharge());
        fare2.setSurchargeMultiplier(fare.getSurchargeMultiplier());
        trip2.setFare(fare2);
        System.out.println("Debug");

    }
}

// class Student { String name; Batch batch;}
