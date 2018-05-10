package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class ConcurrentWorker extends Worker {
    public void work() {
        Thread t = new Thread(super::work);
        t.start();
    }
}
