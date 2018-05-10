package com.company.r05.wyjatki_asercje_logi.code.sec01;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Kamil
 */
public class TryFinallyDemo {
    public static Lock myLock = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[2];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()-> {
                try {
                    for (int k = 1; k <= 1000; k++) {
                        myLock.lock();
                        try {
                            counter++;
                            Thread.sleep(1);
                        } finally {
                            myLock.unlock();
                        }
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            });
        }
        Arrays.asList(threads).forEach(Thread::start);

        for (Thread t : threads) t.join();
        System.out.println(counter);
    }
}
