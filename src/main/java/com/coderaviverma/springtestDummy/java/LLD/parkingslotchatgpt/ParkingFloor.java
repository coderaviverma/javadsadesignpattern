package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSlot> parkingSlots;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSlots=new ArrayList<>();
    }

    public void addParkingSpot(ParkingSlot slots){
        parkingSlots.add(slots);
    }

    public ParkingSlot findParkingSlots(Vehicle vehicle){

        for (ParkingSlot parkingSlot:parkingSlots){
            if (parkingSlot.isAvailable() && parkingSlot.canFitVehicle(vehicle)){
                return parkingSlot;
            }
        }

        return null;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }
}
