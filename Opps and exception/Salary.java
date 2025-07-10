class Employee {   // Parent class
    String name;
    Double Salary;

    Employee(String name, Double Salary) {
        this.name = name;
        this.Salary = Salary;
    }


    public double calculateSalary() {     // Method for throwing NullPointerException
        return Salary * 1.1; //if salary is null
    }
}


class Manager extends Employee {   // Child class

    Manager(String name, Double Salary) {
        super(name, Salary);
    }


    @Override
    public double calculateSalary() {    // Overriding the method and handling the exception
        try {
            return super.calculateSalary();
        } catch (NullPointerException e) {
            System.out.println("Error calculating salary for " + name + ": salary is missing.");
            return 0.0;
        }
    }
}


public class Salary {
    public static void main(String[] args) {   // Main class
        // Manager with valid salary
        Manager m1 = new Manager("ABC", 5000.0);
        System.out.println("Salary of " + m1.name + ": $" + m1.calculateSalary());

        // Manager with null salary
        Manager m2 = new Manager("XYZ", null);
        System.out.println("Salary of " + m2.name + ": $" + m2.calculateSalary());
    }
}
