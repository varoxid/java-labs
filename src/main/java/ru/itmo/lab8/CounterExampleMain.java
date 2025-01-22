package ru.itmo.lab8;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

/**
 * Part 3
 */
class ConcurrentCounter {
    private int count;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increment() {
        try {
            lock.writeLock().tryLock(1, TimeUnit.MINUTES);
            this.count++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public int getCount() {
        try {
            lock.readLock().tryLock(1, TimeUnit.MINUTES);
            return count;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.readLock().unlock();
        }
    }
}

class CounterExampleMain {
    public static void main(String[] args) throws InterruptedException {
        final ConcurrentCounter counter = new ConcurrentCounter();
        final CountDownLatch latch = new CountDownLatch(100);
        final ExecutorService executor = Executors.newFixedThreadPool(100);

        IntStream.range(0, 100)
                .forEach(thread -> executor.submit(() -> {
                    IntStream.range(0, 1000).forEach(number -> counter.increment());
                    latch.countDown();
                }));

        latch.await();
        System.out.printf("Count: %s %n", counter.getCount());
        executor.shutdown();
    }
}
