// Person.java
public class Person {
    String name;
    int age;

    public Person(String name, int age) throws InValidException {
        if (age < 0) {
            throw new InValidException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
        System.out.println("Person details: " + name + ", Age: " + age);
    }

    //  Move main() here (outside any inner class)
    public static void main(String[] args) {
        try {
            Person p1 = new Person("ABC", 25);  // Valid
            Person p2 = new Person("XYZ", -5);  // Will throw exception
        } catch (InValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
