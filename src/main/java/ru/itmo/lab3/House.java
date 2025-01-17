package ru.itmo.lab3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Part 3
 */
class House {
    private String name;
    private Integer floorCount;
    private LocalDate buildDate;

    public House setParameters(String name, Integer floorCount, LocalDate buildDate) {
        this.name = name;
        this.floorCount = floorCount;
        this.buildDate = buildDate;
        return this;
    }

    public long getYearsSinceBuilt() {
        return buildDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void printParameters() {
        System.out.printf("name=%s, floorCount=%s, buildDateTime=%s yearsSinceBuilt=%s %n",
                name, floorCount, buildDate, getYearsSinceBuilt());
    }
}

class HouseExampleMain {
    public static void main(String[] args) {
        new House()
                .setParameters("house1", 3, LocalDate.parse("2018-01-01"))
                .printParameters();

        new House()
                .setParameters("house2", 5, LocalDate.parse("2000-12-12"))
                .printParameters();
    }
}
