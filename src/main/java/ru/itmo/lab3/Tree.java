package ru.itmo.lab3;

/**
 * Part 4
 */
class Tree {
    private String name;
    private Integer age;
    private boolean alive;

    public Tree() {
        System.out.println("Empty constructor");
    }

    public Tree(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, Integer age, Boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }
}

class TreeExampleMain {
    public static void main(String[] args) {
        System.out.println(new Tree());
        System.out.println(new Tree("deadTree", 10000));
        System.out.println(new Tree("tree", 1, true));
    }
}
