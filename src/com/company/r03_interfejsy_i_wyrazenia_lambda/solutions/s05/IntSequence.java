package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s05;

public interface IntSequence {
    static IntSequence constant(int c) {
        return () -> c;
    }

    default boolean hasNext() { return true; }
    int next();
}
