package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec04;

import java.io.UnsupportedEncodingException;
import java.util.ServiceLoader;

/**
 * @author Kamil
 */
public class ServiceLoaderDemo {
    public static ServiceLoader<Cipher> cipherLoader = ServiceLoader.load(Cipher.class);

    public static void main(String[] args) throws UnsupportedEncodingException {
        Cipher ciph = getCipher(1);
        String message = "Meet me at the toga party.";
        byte[] bytes = ciph.encrypt(message.getBytes(), new byte[] { 3 });
        String encrypted = new String(bytes, "UTF-8");
        System.out.println(encrypted);
    }

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader) // .rm Implicitly calls iterator
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }
}
