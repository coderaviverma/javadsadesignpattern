package com.coderaviverma.springtestDummy.java.LLD.elvgpt;

import java.util.ArrayList;
import java.util.List;

// ElevatorSystem class
class ElevatorSystem {
    private List<Elevator> elevators;
    private RequestScheduler scheduler;

    public ElevatorSystem(int numElevators) {
        elevators = new ArrayList<>();
        for (int i = 0; i < numElevators; i++) {
            Elevator elevator = new Elevator(i);
            elevators.add(elevator);
            new Thread(elevator).start();
        }
        scheduler = new RequestScheduler(elevators);
    }

    public void requestPickup(int floor, Direction direction) {
        Elevator elevator = scheduler.assignElevator(floor, direction);
        if (elevator != null) {
            elevator.addRequest(floor);
            System.out.println("Request at floor " + floor + " assigned to elevator " + elevator.getId());
        }
    }

    public void shutdown() {
        for (Elevator elevator : elevators) {
            elevator.stop();
        }
    }
}
