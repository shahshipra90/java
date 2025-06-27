public class operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 8;

        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest number is: " + c);
        } else {
            System.out.println("there are equal large numbers");
        }
    }
}
