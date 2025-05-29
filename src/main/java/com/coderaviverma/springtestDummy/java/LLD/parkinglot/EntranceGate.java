package com.coderaviverma.springtestDummy.java.LLD.parkinglot;

import java.util.List;

// EntranceGate class
class EntranceGate {
    ParkingSpotManagerFactory factory;

    EntranceGate(ParkingSpotManagerFactory factory) {
        this.factory = factory;
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots) {
        ParkingSpotManager manager = factory.getParkingSpotManager(vehicleType, spots);
        return manager.findParkingSpace();
    }

    Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        // Implementation to generate ticket
        Ticket ticket=new Ticket(parkingSpot,vehicle);
        return ticket;
    }
}