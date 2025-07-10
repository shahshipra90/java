class Calculator {
    public void divide(int a, int b) {
        try {
            System.out.println("Int division result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error : Int Division by zero");
        }
    }

    public void divide(double a, double b) {
        try {
            System.out.println("Double division result: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error : Double Division by zero");
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();


        calc.divide(12, 2);
        calc.divide(12, 0);

        calc.divide(5.5, 0.0);
    }
}
