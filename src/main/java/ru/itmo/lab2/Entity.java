package ru.itmo.lab2;

/**
 * Part 2
 */
public class Entity {

    private String name;
    private Integer value;

    public Entity() {
        this("default", 0);
    }

    public Entity(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}
