package ru.itmo.lab8;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

/**
 * Part 1, Part 2
 */
class PrinterRunnable implements Runnable {
    private final int printerNumber;
    private final CountDownLatch latch;

    public PrinterRunnable(int printerNumber, CountDownLatch latch) {
        this.printerNumber = printerNumber;
        this.latch = latch;
    }

    @Override
    public void run() {
        IntStream.rangeClosed(0, 100).forEach(number ->
                System.out.printf("Printer #%s: %s %n", printerNumber, number));
        latch.countDown();
    }
}

class ThreadsPrinterExampleMain {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        final List<Thread> threadList = IntStream.range(0, 10)
                .mapToObj(threadNumber -> new Thread(
                        new PrinterRunnable(threadNumber, countDownLatch),
                        "Thread_" + threadNumber))
                .toList();

        threadList.forEach(thread ->
                System.out.printf("%s state: %s %n", thread.getName(), thread.getState()));

        threadList.forEach(thread -> {
            thread.start();
            System.out.printf("%s state: %s %n", thread.getName(), thread.getState());
        });

        countDownLatch.await();

        threadList.forEach(thread ->
                System.out.printf("%s state: %s %n", thread.getName(), thread.getState()));
    }
}
