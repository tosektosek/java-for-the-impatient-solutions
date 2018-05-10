package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s13;

import java.util.Arrays;

/**
 * @author Kamil
 */
public class RunnableDemo {

    public static Runnable doSomething(Runnable[] runnables) {
        return () ->
                Arrays.asList(runnables).parallelStream().forEach(Runnable::run);
    }

    public static void main(String[] args) {

        RunnableInstance instance = new RunnableInstance();
        RunnableInstance instance1 = new RunnableInstance();
        RunnableInstance instance2 = new RunnableInstance();
        RunnableInstance instance3 = new RunnableInstance();
        RunnableInstance instance4 = new RunnableInstance();
        Runnable[] runnables = new Runnable[]{
                instance,instance2,instance3,instance4,instance1
        };

        doSomething(runnables).run();

    }
}
