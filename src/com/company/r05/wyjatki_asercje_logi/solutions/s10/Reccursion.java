package com.company.r05.wyjatki_asercje_logi.solutions.s10;

import java.math.BigInteger;

/**
 * @author Kamil
 */
public class Reccursion {
    public static void main(String[] args) {
        factorial(5);
    }

    public static BigInteger factorial(int value) {
        BigInteger sum = BigInteger.ONE;
        int counter = value;
        if(value > 0) {
            sum = factorial(value - 1).multiply(BigInteger.valueOf(value));
            System.out.println(sum);
            try {
                Exception e = new Exception();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return sum;
        }
        sum = BigInteger.ONE;
        return sum;
    }

}
