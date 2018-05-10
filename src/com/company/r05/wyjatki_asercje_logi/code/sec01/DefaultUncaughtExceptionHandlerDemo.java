package com.company.r05.wyjatki_asercje_logi.code.sec01;

/**
 * @author Kamil
 */
public class DefaultUncaughtExceptionHandlerDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex)-> {
            System.err.println(ex.getMessage());
            System.err.println("Goodbye, cruel world!");
        });
        //System.out.println(1 / 0);
        String n = null;
        n.toString();
    }
}
