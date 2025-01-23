// Write a program to show the deadlock situation using the multi-threading concept.

public class A7Deadlock {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1 holding lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lock2) {
                    System.out.println("Thread 1 holding lock 2...");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2 holding lock 2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (lock1) {
                    System.out.println("Thread 2 holding lock 1...");
                }
            }
        });

        t1.start();
        t2.start();
    }
}

// OUTPUT ---
// Thread 1 holding lock 1...
// Thread 2 holding lock 2...
// ...