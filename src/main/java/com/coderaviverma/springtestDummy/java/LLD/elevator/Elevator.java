package com.coderaviverma.springtestDummy.java.LLD.elevator;

import java.util.TreeSet;

public class Elevator {

    private int id;
    private int currentFloor=0;
    private Direction direction = Direction.UP;
    private Status status=Status.IDLE;
    private TreeSet<Integer> requests=new TreeSet<>();

    public Elevator(int id) {
        this.id = id;
    }

    public void addRequest(int floor){
        requests.add(floor);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Direction getDirection() {
        return direction;
    }

    public void move(){
        if(requests.isEmpty()){
            status=Status.IDLE;
            return;
        }

        Integer target=direction==Direction.UP ? requests.ceiling(currentFloor) : requests.floor(currentFloor);

        if (target==null){
            direction=direction == Direction.UP ? Direction.DOWN : Direction.UP ;
            return;
        }

        if (target> currentFloor){
            currentFloor++;
            status=Status.MOVING;
        }else if (target<currentFloor){
            currentFloor--;
            status=Status.MOVING;
        }else{
            status=Status.DOOR_OPEN;
            requests.remove(target);
        }



    }
}
