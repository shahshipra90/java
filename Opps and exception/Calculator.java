public class Calculator {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Int Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error! Integer cannot be divided by zero.");
        }
    }

    public void divide(double a, double b) {
        try {
            if (b == 0.0) {
                throw new ArithmeticException("Double divide by zero");
            }
            double result = a / b;
            System.out.println("Double Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error! Double cannot be divided by zero.");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();


        calc.divide(10, 2);
        calc.divide(10, 0);

        calc.divide(10.5, 2.0);
        calc.divide(10.5, 0.0);
    }
}
