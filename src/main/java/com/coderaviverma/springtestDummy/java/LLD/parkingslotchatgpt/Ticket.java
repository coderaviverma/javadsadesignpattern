package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

public class Ticket {

    private String ticketNo;
    private Vehicle vehicle;
    private long entryTime;
    private ParkingSlot parkingSlot;

    public Ticket(String ticketNo, Vehicle vehicle,  ParkingSlot parkingSlot) {
        this.ticketNo = ticketNo;
        this.vehicle = vehicle;
        this.entryTime = System.currentTimeMillis();
        this.parkingSlot = parkingSlot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
