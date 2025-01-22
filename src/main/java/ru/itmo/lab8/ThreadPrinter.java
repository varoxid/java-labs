package ru.itmo.lab8;

/**
 * Part 4
 */
public class ThreadPrinter extends Thread {

    private final Object lock;

    public ThreadPrinter(Object lock) {this.lock = lock;}

    @Override
    public void run() {
        execute();
    }

    protected void execute() {
        while (true) {
            System.out.println(this.getName());
            synchronized (lock) {
                try {
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class ThreadPrintNamesExample {
    public static void main(String[] args) {
        final Object lock = new Object();
        new ThreadPrinter(lock).start();
        new ThreadPrinter(lock).start();
    }
}
