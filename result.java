import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int subjects = 5;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks " + i + ": ");
            total += sc.nextInt();
        }

        double percentage = (double) total / subjects;
        System.out.println("Total : " + total);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
