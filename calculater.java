public class calculater {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 4;

        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        int quotient = n1 / n2;
        int remainder = n1 % n2;

        System.out.println("Number 1: " + n1);
        System.out.println("Number 2: " + n2);
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Modulus: " + remainder);
    }
}
