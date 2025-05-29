package com.coderaviverma.springtestDummy.java.LLD.elvgpt;

import java.util.List;

// RequestScheduler class
class RequestScheduler {
    private List<Elevator> elevators;

    public RequestScheduler(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public Elevator assignElevator(int floor, Direction direction) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;

        for (Elevator elevator : elevators) {
            Status status = elevator.getStatus();
            Direction currentDir = elevator.getDirection();
            int currentFloor = elevator.getCurrentFloor();

            boolean isCandidate = status == Status.IDLE ||
                                  (currentDir == direction &&
                                   ((direction == Direction.UP && currentFloor <= floor) ||
                                    (direction == Direction.DOWN && currentFloor >= floor)));

            if (isCandidate) {
                int distance = Math.abs(currentFloor - floor);
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = elevator;
                }
            }
        }

        return bestElevator != null ? bestElevator : elevators.get(0);
    }
}
