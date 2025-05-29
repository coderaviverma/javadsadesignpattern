package com.coderaviverma.springtestDummy.java.LLD.elvgpt;

import java.util.TreeSet;

// Elevator class with Runnable for multithreading
class Elevator implements Runnable {
    private int id;
    private int currentFloor = 0;
    private Direction direction = Direction.UP;
    private Status status = Status.IDLE;
    private TreeSet<Integer> requests = new TreeSet<>();
    private boolean running = true;

    public Elevator(int id) {
        this.id = id;
    }

    public void addRequest(int floor) {
        requests.add(floor);
    }

    public void move() {
        if (requests.isEmpty()) {
            status = Status.IDLE;
            return;
        }

        Integer target = direction == Direction.UP ? requests.ceiling(currentFloor)
                : requests.floor(currentFloor);

        if (target == null) {
            direction = (direction == Direction.UP) ? Direction.DOWN : Direction.UP;
            return;
        }

        if (target > currentFloor) {
            currentFloor++;
            status = Status.MOVING;
        } else if (target < currentFloor) {
            currentFloor--;
            status = Status.MOVING;
        } else {
            openDoor();
            requests.remove(currentFloor);
        }

        System.out.println("Elevator " + id + " at floor " + currentFloor + " (" + status + ")");
    }

    private void openDoor() {
        status = Status.DOOR_OPEN;
        System.out.println("Elevator " + id + " opening door at floor " + currentFloor);
        try {
            Thread.sleep(3000); // simulate door open time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        closeDoor();
    }

    private void closeDoor() {
        status = Status.MOVING;
        System.out.println("Elevator " + id + " closing door at floor " + currentFloor);
    }

    @Override
    public void run() {
        while (running) {
            move();
            try {
                Thread.sleep(1000); // simulate time per floor
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        running = false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }
}
