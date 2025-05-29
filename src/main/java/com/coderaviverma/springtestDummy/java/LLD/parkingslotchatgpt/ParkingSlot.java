package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

public class ParkingSlot {

    private String spotId;
   private SpotType spotType;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSlot(String spotId, SpotType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
        this.isOccupied=false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean canFitVehicle(Vehicle vehicle){

        if (vehicle.vehicleType==VehicleType.MOTORCYCLE && spotType==SpotType.SMALL){
            return true;
        }else if (vehicle.vehicleType==VehicleType.CAR && spotType==SpotType.MEDIUM){
            return true;
        }else if (vehicle.vehicleType==VehicleType.TRUCK && spotType==SpotType.LARGE){
            return true;
        }
        return false;
    }

    public void assignVehicle(Vehicle vehicle){
        this.vehicle=vehicle;
        this.isOccupied=true;
    }

    public void removeVehicle(){
        this.vehicle=null;
        this.isOccupied=false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSpotId() {
        return spotId;
    }
}
