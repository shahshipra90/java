public class divisible {
    public static void main(String[] args) {
        int n = 15;

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Divisible by both");
        } else {
            System.out.println("Not divisible by both");
        }
    }
}

