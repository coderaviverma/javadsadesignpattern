package com.coderaviverma.springtestDummy.java.LLD.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

   private List<Elevator> elevators;
    private RequestScheduler scheduler;

    public ElevatorSystem(int elevatorCount){
        elevators=new ArrayList<>();
        for (int i = 0; i < elevatorCount; i++) {
            elevators.add(new Elevator(i));
        }
        scheduler=new RequestScheduler(elevators);
    }

    public void  requestPickup(int floor,Direction direction){
        Elevator elevator = scheduler.assignElevator(floor, direction);
        if (elevator!=null){
            elevator.addRequest(floor);
        }
    }

    public void step(){
        for (Elevator elevator:elevators){
            elevator.move();
        }
    }

}
