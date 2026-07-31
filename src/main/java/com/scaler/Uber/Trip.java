package com.scaler.Uber;

public class Trip {
    private String tripId;
    private String source;
    private String destination;
    private Fare fare;

    public Trip() {
    }

    public Trip(String tripId, String source, String destination, Fare fare) {
        this.tripId = tripId;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }
    // Copy constructor
    public Trip(Trip trip) {
        this.tripId = trip.getTripId();
        this.source = trip.getSource();
        this.destination = trip.getDestination();
//        this.fare = trip.getFare(); // Shallow copy
        this.fare = new Fare(trip.getFare());
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }
}
