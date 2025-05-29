package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private String name;
    private List<ParkingFloor> floors;

    public ParkingLot(String name) {
        this.name = name;
        this.floors = new ArrayList<>();
    }

    public void addParkingFloors(ParkingFloor parkingFloor){
        floors.add(parkingFloor);
    }

    public ParkingSlot parkVehicle(Vehicle vehicle){

        for (ParkingFloor parkingFloor:floors){
            ParkingSlot slot=parkingFloor.findParkingSlots(vehicle);
            if (slot!=null){
                slot.assignVehicle(vehicle);
                return slot;
            }

        }
        return null;
    }

    public void removeVehicle(Vehicle vehicle){

        for (ParkingFloor parkingFloor:floors){
            for (ParkingSlot parkingSlot:parkingFloor.getParkingSlots()){
                if (!parkingSlot.isAvailable() && parkingSlot.getVehicle()==vehicle){
                    parkingSlot.removeVehicle();
                    return;
                }
            }
        }

    }



}
