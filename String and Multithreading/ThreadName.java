class MyThread extends Thread {
    @Override
    public void run() {
        // Print the thread's name using getName()
        System.out.println("Inside MyThread (run method):");
        System.out.println("Thread's name using getName(): " + getName());
        System.out.println("Current thread using Thread.currentThread(): " + Thread.currentThread());
    }
}

public class ThreadName {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread thread = new MyThread();
        // Optionally, set a custom name for the thread
        thread.setName("ChildThread");
        // Start the custom thread
        thread.start();

        // In the main thread, also print the current thread details
        System.out.println("Inside main method:");
        System.out.println("Main thread using Thread.currentThread(): " + Thread.currentThread());
        // Optionally, print the name of the created thread from main (should be ChildThread)
        System.out.println("Created thread's name using getName(): " + thread.getName());
    }
}
