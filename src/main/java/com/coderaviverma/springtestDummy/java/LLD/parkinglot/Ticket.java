package com.coderaviverma.springtestDummy.java.LLD.parkinglot;

// Ticket class
class Ticket {
    long entryTime;
    ParkingSpot parkingSpot;
    Vehicle vehicle;

    Ticket( ParkingSpot parkingSpot, Vehicle vehicle) {
        this.entryTime = System.currentTimeMillis();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }
}
