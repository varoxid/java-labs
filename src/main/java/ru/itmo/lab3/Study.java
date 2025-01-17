package ru.itmo.lab3;

/**
 * Part 1
 */
class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        System.out.println(new Study("Learning Java is easy!").printCourse());
    }
}
