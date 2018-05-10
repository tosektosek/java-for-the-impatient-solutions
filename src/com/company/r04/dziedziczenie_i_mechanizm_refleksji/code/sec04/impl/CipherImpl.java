package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec04.impl;

import com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec04.Cipher;

/**
 * @author Kamil
 */
public class CipherImpl implements Cipher {

    public byte[] encrypt(byte[] source, byte[] key) {
        byte[] result = new byte[source.length];
        for (int i = 0; i < source.length; i++)
            result[i] = (byte)(source[i] + key[0]);
        return result;
    }
    public byte[] decrypt(byte[] source, byte[] key) {
        return encrypt(source, new byte[] { (byte) -key[0] });
    }
    public int strength() { return 1; }
}