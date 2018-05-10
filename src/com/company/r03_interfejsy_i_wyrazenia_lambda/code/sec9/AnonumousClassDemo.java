package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec9;

import java.util.Random;

/**
 * @author Kamil
 */
public class AnonumousClassDemo {
    private static Random generator = new Random();

    public static IntSequence randomInts(int low, int high) {
        return new IntSequence() {

            public boolean hasNext() {return true;}
            public int next() { return low + generator.nextInt(high - low + 1); }
        };
    }

    public static void main(String[] args) {
        IntSequence dieTosses = randomInts(1, 6);
        for (int i = 0; i< 10; i++) System.out.println(dieTosses.next());
    }
}
