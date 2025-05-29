package com.coderaviverma.springtestDummy.java.LLD.elvgpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

// Main
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ElevatorSystem system = new ElevatorSystem(3);

        // Simulated I/O Panel
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter pickup request (e.g., 5 UP or 2 DOWN): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                String[] parts = input.split(" ");
                int floor = Integer.parseInt(parts[0]);
                Direction direction = Direction.valueOf(parts[1].toUpperCase());
                system.requestPickup(floor, direction);
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        system.shutdown();
    }
}
