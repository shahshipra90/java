import java.util.Scanner;

public class user_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter city: ");
        String city = sc.next();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        sc.close();
    }
}
