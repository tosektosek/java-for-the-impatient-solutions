package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec01;

/**
 * @author Kamil
 */
public class DigitSequence implements IntSequence {
    private int number;

    public DigitSequence(int number) {
        this.number = number;
    }

    public boolean hasNext() {
        return number != 0;
    }

    public int next() {
        int result = number % 10;
        number /= 10;
        return result;
    }

    public int rext() {
        return number;
    }
}
