package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class ConcurrentWorkerTest {
    public static void main(String[] args) {
        ConcurrentWorker worker = new ConcurrentWorker();
        worker.work();
        System.out.println("Done");
    }
}
