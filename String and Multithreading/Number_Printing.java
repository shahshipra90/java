class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);  // Pause for half a second between numbers
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Number_Printing {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        Thread thread = new Thread(printer);
        thread.start();
    }
}
