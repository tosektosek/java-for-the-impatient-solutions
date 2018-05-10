package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.math.BigInteger;

public class s06 {
    public static void main(String[] args) {

        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1; i < 1000; i++) {
            factorial =  factorial.multiply(
                    factorial.multiply(BigInteger.valueOf(i))
            );
        }

        System.out.println(factorial.toString());
    }
}
