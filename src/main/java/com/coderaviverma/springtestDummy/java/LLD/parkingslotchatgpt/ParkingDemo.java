package com.coderaviverma.springtestDummy.java.LLD.parkingslotchatgpt;

public class ParkingDemo {

    public static void main(String[] args) {


        ParkingLot parkingLot=new ParkingLot("AV Parking");

        ParkingFloor parkingFloor1=new ParkingFloor(1);
        parkingFloor1.addParkingSpot(new ParkingSlot("1A",SpotType.SMALL));
        parkingFloor1.addParkingSpot(new ParkingSlot("1B",SpotType.MEDIUM));

        parkingLot.addParkingFloors(parkingFloor1);


        Vehicle vehicle1=new Vehicle("up161111",VehicleType.CAR);
        Vehicle vehicle2=new Vehicle("1122",VehicleType.MOTORCYCLE);

        ParkingSlot slot=parkingLot.parkVehicle(vehicle1);

        if (slot!=null){

            System.out.println("Vehicle park at slot "+slot.getSpotId());
            Ticket ticket=new Ticket("0001",vehicle1,slot);


            Payment payment=new Payment(ticket,5);
            payment.processPayment();

            parkingLot.removeVehicle(ticket.getVehicle());
            System.out.println("Vehicle Exited");

        }else {
            System.out.println("No Avaiable slot");
        }

    }
}
