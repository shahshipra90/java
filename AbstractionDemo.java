interface Taxable {
    void payTax();
}

abstract class Emp {
    String name;
    double salary;

    Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Emp implements Taxable {
    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    void calculateSalary() {
        System.out.println(name + " full-time job salary: " + salary);
    }

    public void payTax() {
        System.out.println(name + " is paying tax on salary.");
    }
}

class PartTimeEmployee extends Emp implements Taxable {
    PartTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    void calculateSalary() {
        System.out.println(name + " part-time job salary: " + salary);
    }

    public void payTax() {
        System.out.println(name + " is paying less tax.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("ABC", 500);
        Employee e2 = new PartTimeEmployee("XYZ", 200);

        e1.calculateSalary();
        ((Taxable) e1).payTax();

        e2.calculateSalary();
        ((Taxable) e2).payTax();
    }
}
