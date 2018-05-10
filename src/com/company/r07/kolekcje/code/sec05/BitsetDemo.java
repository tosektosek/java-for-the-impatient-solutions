package com.company.r07.kolekcje.code.sec05;

import java.util.BitSet;

/**
 * @author Kamil
 */
public class BitsetDemo {
    public static void main(String[] args) {
        int n = 10000;
        BitSet primes = new BitSet(n + 1);

        for (int i = 2; i <= n; i++)
            primes.set(i);
        for (int i = 2; i * i <= n; i++) {
            if (primes.get(i)) {
                for (int k = 2 * i; k <= n; k += i)
                    primes.clear(k);
            }
        }
        System.out.println(primes);
    }
}
