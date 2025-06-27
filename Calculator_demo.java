class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator_demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 intger: " + calc.add(1, 2));
        System.out.println("Sum of 2 double: " + calc.add(1.5, 1.5));
        System.out.println("Sum of 3 integer: " + calc.add(1, 2, 3));
    }
}
