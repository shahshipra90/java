class Student {
    String name;
    int age;

    // Default Constructor 1
    Student() {
        this("Unknown", 0); // calls Constructor 2
        System.out.println("Default constructor called.");
    }

    // Constructor 2 - with name
    Student(String name) {
        this(name, 18); // calls Constructor 3
        System.out.println("Constructor with name called.");
    }

    // Constructor 3 - with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Constructor with name and age called.");

        //  ArithmeticException
        try {
            int result = age / 0; // division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        System.out.println("***************");

        Student s2 = new Student("ABC");
        s2.display();

        System.out.println("******************");

        Student s3 = new Student("XYZ", 20);
        s3.display();
    }
}
