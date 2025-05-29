package com.coderaviverma.springtestDummy.java.LLD.elevator;

import java.util.List;

public class RequestScheduler {

    List<Elevator> elevators;

    public RequestScheduler(List<Elevator> elevators){
        this.elevators=elevators;
    }

    public Elevator assignElevator(int floor, Direction direction){
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator:elevators){

            if (elevator.getStatus() == Status.IDLE || elevator.getDirection() == direction ){
                int distance = Math.abs(elevator.getCurrentFloor()-floor);
                if (distance<minDistance){
                    minDistance=distance;
                    bestElevator=elevator;
                }
            }
        }
        return bestElevator !=null ? bestElevator : elevators.get(0);
    }

}
