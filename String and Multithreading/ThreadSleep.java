class NumberThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000); // 1-second delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        NumberThread t = new NumberThread();
        t.start();
    }
}
