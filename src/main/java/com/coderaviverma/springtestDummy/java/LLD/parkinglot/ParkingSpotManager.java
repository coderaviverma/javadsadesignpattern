package com.coderaviverma.springtestDummy.java.LLD.parkinglot;

import java.util.List;

// ParkingSpotManager class
abstract class ParkingSpotManager {
    List<ParkingSpot> spots;

    ParkingSpotManager(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    abstract ParkingSpot findParkingSpace();

    void parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpace();
        spot.parkVehicle(v);
    }

    void removeVehicle(Vehicle v) {
        for (ParkingSpot spot : spots) {
            if (spot.vehicle != null && spot.vehicle.equals(v)) {
                spot.removeVehicle();
                break;
            }
        }
    }
}
