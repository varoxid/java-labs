package ru.itmo.lab7;

/**
 * Part 1, Part 2
 */
class Plane {

    class Wing {
        private final Integer weight;

        public Wing(Integer weight) {
            this.weight = weight;
        }

        public Integer getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Wing{" +
                    "weight=" + weight +
                    '}';
        }
    }
}

class InnerClassesExampleMain {
    public static void main(String[] args) {
        System.out.println(new Plane().new Wing(100));
        System.out.println(new Plane().new Wing(200));
    }
}
