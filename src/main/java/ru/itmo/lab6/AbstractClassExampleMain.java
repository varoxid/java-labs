package ru.itmo.lab6;

/**
 * Part 1, Part 2
 */
abstract class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected abstract String getInfo();
}

class BankEmployee extends Person implements BankInteractor {

    private final String bankName;

    public BankEmployee(String bankName, String firstName, String lastName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    protected String getInfo() {
        return toString();
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "{" +
                "bankName='" + bankName + '\'' +
                "firstName='" + super.getFirstName() + '\'' +
                "lastName='" + super.getLastName() + '\'' +
                '}';
    }
}

class Client extends Person implements BankInteractor {

    private final String bankName;

    public Client(String bankName, String firstName, String lastName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    protected String getInfo() {
        return toString();
    }

    @Override
    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "{" +
                "bankName='" + bankName + '\'' +
                "firstName='" + super.getFirstName() + '\'' +
                "lastName='" + super.getLastName() + '\'' +
                '}';
    }
}

interface BankInteractor {
    String getBankName();
}

class AbstractClassExampleMain {
    public static void main(String[] args) {
        System.out.println(new BankEmployee("bank1", "first_name_1", "last_name_1")
                .getInfo());
        System.out.println(new Client("bank2", "first_name_2", "last_name_2")
                .getInfo());
    }
}
