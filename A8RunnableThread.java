// Write a program to create a thread using Runnable interface. Show the usage of sleep() and join() inside the thread.

class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class A8RunnableThread {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}

// OUTPUT ---
// 0
// 1
// 2
// 3
// 4
