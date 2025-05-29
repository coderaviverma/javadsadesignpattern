package com.coderaviverma.springtestDummy.java.LLD.parkinglot;

import java.util.List;

// ParkingSpotManagerFactory class
class ParkingSpotManagerFactory {
    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
        if (vehicleType == VehicleType.TwoWheeler)
            return new TwoWheelerManager(spots);
        else if (vehicleType == VehicleType.FourWheeler)
            return new FourWheelerManager(spots);
        else
            return null; // Handle error
    }
}