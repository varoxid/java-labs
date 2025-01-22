package ru.itmo.lab9;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Part 4
 */
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    /**
     * Static factory method which returns the new instance of User
     * @return the new user
     */
    static User of(String username) {
        return new User(username);
    }

    /**
     * @return username
     */
    public String getName() {
        return name;
    }

    /**
     * @param name username
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

class UsersRatingGenerator {
    static Map<User, Integer> generateUsersRatings(int userCount) {
        return IntStream.rangeClosed(1, userCount)
                .mapToObj(i -> User.of("User_" + i))
                .collect(Collectors.toMap(user -> user, user -> ThreadLocalRandom.current().nextInt(1000)));
    }
}

class UserRatingsExampleMain {
    public static void main(String[] args) {
        final Map<User, Integer> userRatings = UsersRatingGenerator.generateUsersRatings(100);

        System.out.println("Enter username: ");
        try (Scanner scan = new Scanner(System.in)) {
            String username;
            Integer userRating;
            while (scan.hasNextLine()) {
                username = scan.nextLine();
                userRating = userRatings.get(User.of(username));
                System.out.printf("%s rating is %s %n",
                        username, Objects.isNull(userRating) ? "unknown" : userRating);
            }
        }
    }
}
