package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec03;

/**
 * @author Kamil
 */
public class RunnableDemo {
    public static void main(String[] args) {
        Runnable task = new HelloTask();
        Thread thread = new Thread(()->{
            for(int i = 0; i < 100; i++)
            System.out.println("HEEEEEE");
        });
        thread.start();
        System.out.println("Started");
    }
}

class HelloTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++)
        System.out.println("Hello");
    }
}