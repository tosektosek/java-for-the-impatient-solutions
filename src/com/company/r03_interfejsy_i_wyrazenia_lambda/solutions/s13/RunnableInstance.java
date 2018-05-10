package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s13;

/**
 * @author Kamil
 */
public class RunnableInstance implements Runnable {

    private int count = 0;
    public void run() {
        System.out.println("Hello " + count++);
    }
}
