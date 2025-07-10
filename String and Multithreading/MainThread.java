// Child thread class extending Thread
class ChildThread extends Thread {
    public void run() {
        System.out.println("Child Thread is Running");
    }
}

public class MainThread {
    public static void main(String[] args) {
        ChildThread child = new ChildThread();
        child.start();  // Start child thread

        System.out.println("Main Thread is Running");
    }
}
