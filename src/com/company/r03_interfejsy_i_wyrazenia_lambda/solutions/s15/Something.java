package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s15;

import java.util.Random;

/**
 * @author Kamil
 */
public class Something {
    private static Random generator = new Random();

    static class RandomSequence implements IntSequence {
        int low;
        int high;

        RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public boolean hasNext() {
            return true;
        }
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }
    }
    private static IntSequence randomIns(int low, int high) {
        return new RandomSequence(low, high);
    }

    public static void main(String[] args) {
        IntSequence tosses = randomIns(1, 6);
        for (int i = 0; i < 10; i++) System.out.println(tosses.next());
    }
}
