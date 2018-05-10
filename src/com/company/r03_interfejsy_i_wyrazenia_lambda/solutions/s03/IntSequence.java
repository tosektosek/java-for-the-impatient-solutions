package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s03;

/**
 * @author Kamil
 */
public interface IntSequence {
    static IntSequence of(int... array) {
        return new IntSequence() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < array.length;
            }

            @Override
            public int next() {
                return hasNext() ? array[pos++] : 0;
            }
        };
    }
    boolean hasNext();
    int next();

}
