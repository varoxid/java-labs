package ru.itmo.lab6;

import java.util.Scanner;

/**
 * Part 3
 */
class Car {
    private int weight;
    private String model;
    private char colorFlag;
    private float speed;

    public Car() {
    }

    public Car(int weight, String model, char colorFlag, float speed) {
        this.weight = weight;
        this.model = model;
        this.colorFlag = colorFlag;
        this.speed = speed;
    }

    protected void printInfo() {
        System.out.printf("Weight %s is %s kg %n", model, weight);
        System.out.printf("Color is %s and speed is %s %n", colorFlag, speed);
    }
}

class Truck extends Car {
    private int wheelCount;
    private int maxWeight;

    public Truck(
            int weight,
            String model,
            char colorFlag,
            float speed,
            int wheelCount,
            int maxWeight) {
        super(weight, model, colorFlag, speed);
        this.wheelCount = wheelCount;
        this.maxWeight = maxWeight;
    }

    public void setNewWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.printf("Wheel count is %s %n", wheelCount);
        System.out.printf("Max weight is %s %n", maxWeight);
    }
}

class CarExamplesMain {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Creating Truck\n=============");

            System.out.println("Enter weight: ");
            final int weight = scan.nextInt();

            System.out.println("Enter model: ");
            final String carModel = scan.next();

            System.out.println("Enter color flag: ");
            final char colorFlag = scan.next().charAt(0);

            System.out.println("Enter speed: ");
            final float speed = scan.nextFloat();

            System.out.println("Enter wheel count: ");
            final int wheelCount = scan.nextInt();

            System.out.println("Enter max weight: ");
            final int maxWeight = scan.nextInt();

            final Truck truck = new Truck(weight, carModel, colorFlag, speed, wheelCount, maxWeight);
            truck.printInfo();
        }
    }
}
