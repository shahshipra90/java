class TableOfFive extends Thread {
    public void run() {
        System.out.println("Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class TableOfTen extends Thread {
    public void run() {
        System.out.println("Table of 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("10 x " + i + " = " + (10 * i));
        }
    }
}

public class Multiplication {
    public static void main(String[] args) {
        TableOfFive t1 = new TableOfFive();
        TableOfTen t2 = new TableOfTen();

        t1.start();  // Start thread for table of 5
        t2.start();  // Start thread for table of 10
    }
}
