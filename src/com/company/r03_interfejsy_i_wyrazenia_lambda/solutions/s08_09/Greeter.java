package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s08_09;

/**
 * @author Kamil
 */
public class Greeter implements Runnable {
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    public void run() {
        int i = 0;
        while (i < n) {
            System.out.println("Witaj " + target);
            i++;
        }
    }

    public static void runTogether(Runnable...tasks) {
        for(Runnable task : tasks) {
            Thread thread = new Thread(task);
            thread.start();
        }
    }

    public static void runInOrder(Runnable...tasks) {
        for(Runnable task : tasks) {
            task.run();
        }
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter(10, "Kamil");
        Greeter greeter1 = new Greeter(10, "Michal");
        Greeter greeter2 = new Greeter(10, "Zygmunt");

//        Thread thread = new Thread(greeter);
//        thread.start();
//
//        Thread thread2 = new Thread(greeter1);
//        thread2.start();

        Thread thread = new Thread(greeter);
        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        //runTogether(thread, thread1, thread2);
        runInOrder(thread, thread1, thread2);
    }
}
