public class largest {
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        int c = 40;

        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }
}
