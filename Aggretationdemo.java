class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Person {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println(name + " lives in " + address.city + ", " + address.state);
    }
}

public class Aggretationdemo {
    public static void main(String[] args) {
        Address addr = new Address("Toronto", "Ontario");
        Person person = new Person("Shipra", addr);

        person.displayInfo();
    }
}
