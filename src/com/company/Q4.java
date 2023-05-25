package com.company;

import java.util.Scanner;

// Question : A Company manufactures Vehicles, which could be a Helicopter
// , a Car, or a Train depending on the customer’s demand. Each Vehicle
// instance has a method called move, which prints on the console the
// nature of movement of the vehicle. For example, the Helicopter Flies in
// Air, the Car Drives on Road and the Train Runs on Track.
// Write a program that accepts input from the user on the kind of vehicle
// the user wants to order, and the system should print out nature of
// movement. Implement all Java coding best practices to implement this
// program.

public class Q4 {
    public static void main(String[] args) {
        System.out.println("What type of vehicle would you like to order?");
        System.out.println("1. Helicopter");
        System.out.println("2. Car");
        System.out.println("3. Train");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        Vehicle vehicle;

        switch (choice) {
            case 1 -> vehicle = new Helicopter();
            case 2 -> vehicle = new Car();
            case 3 -> vehicle = new Train();
            default -> {
                System.out.println("Invalid choice. Exiting program.");
                return;
            }
        }

        vehicle.move();
    }
}

abstract class Vehicle{
    public abstract void move();
}

class Helicopter extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Helicopter flies in the air.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Car drives on the road.");
    }
}

class Train extends Vehicle {
    @Override
    public void move() {
        System.out.println("The Train runs on the track.");
    }
}
