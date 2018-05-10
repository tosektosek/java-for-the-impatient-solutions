package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec01;

/**
 * @author Kamil
 */
public class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext() {
        return true;
    }

    public int next() {
        i++;
        return i * i;
    }
}
