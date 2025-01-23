package ru.itmo.lab6;

/**
 * Part 4, Part 5
 */
class Parent {
    private String value;
    protected String protectedValue;
    protected int age;
    protected String name;

    public Parent(String value, String protectedValue, int age, String name) {
        this.value = value;
        this.protectedValue = protectedValue;
        this.age = age;
        this.name = name;
    }

    protected String getValue() {
        return value;
    }

    protected int getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }
}

class Child extends Parent {

    public Child(String value, String protectedValue, int age, String name) {
        super(value, protectedValue, age, name);
    }

    void printValues() {
        System.out.println("Parent value: " + super.getValue());
        System.out.println("Parent protected value: " + super.protectedValue);
    }

    @Override
    protected String getName() {
        return "child name is " + super.getName();
    }
}

class InheritanceExampleMain {
    public static void main(String[] args) {
        final Child child = new Child("value_1", "value_2", 20, "Name1");
        child.printValues();

        System.out.println(child.getName());
    }
}
