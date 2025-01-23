package ru.itmo.lab3;

/**
 * Part 2
 */
public class Car {

    private String name;
    private String color;
    private Integer weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.name = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class CarExampleMain {
    public static void main(String[] args) {
        System.out.println(new Car("red"));
        System.out.println(new Car("green", 100));
    }
}
