package com.coderaviverma.springtestDummy.java.LLD.elevator;

public class ElevatorMain {

    public static void main(String[] args) {

        ElevatorSystem elevatorSystem=new ElevatorSystem(3);
        elevatorSystem.requestPickup(3,Direction.UP);
        elevatorSystem.requestPickup(6,Direction.DOWN);
        elevatorSystem.requestPickup(1,Direction.UP);
        elevatorSystem.requestPickup(0,Direction.UP);


        // Simulate movement steps
        for (int i = 0; i < 10; i++) {
            elevatorSystem.step();
            try {
                Thread.sleep(1000); // Optional: simulate real time
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
