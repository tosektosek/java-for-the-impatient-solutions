package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec04;

public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);
    byte[] decrypt(byte[] source, byte[] key);
    int strength();
}
