package com.company.r05.wyjatki_asercje_logi.solutions.s08;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Kamil
 */
public class HelperMethod {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        try(AutoCloseable l = help(lock)) {
            lock.lock();
            l.close();

        } catch (Exception ex) {

        }
    }

    public static AutoCloseable help(ReentrantLock lock) {
        return () -> {
            try {
                if(lock.isLocked())
                    lock.unlock();
            } catch (IllegalMonitorStateException ex) {
                System.out.println("WYJĄTEK W METODZIE POMOCNICZEJ");
            }
        };
    }
}
