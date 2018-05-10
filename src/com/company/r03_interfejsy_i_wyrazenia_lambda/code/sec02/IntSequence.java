package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec02;

public interface IntSequence {
    default boolean hasNext() { return true; }
    int next();
}
