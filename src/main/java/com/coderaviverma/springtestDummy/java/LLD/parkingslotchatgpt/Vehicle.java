package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

import java.util.Objects;

public class Vehicle {

    String vehichleNo;
    VehicleType vehicleType;

    public Vehicle(String vehichleNo, VehicleType vehicleType) {
        this.vehichleNo = vehichleNo;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vehichleNo, vehicle.vehichleNo) && vehicleType == vehicle.vehicleType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehichleNo, vehicleType);
    }
}
