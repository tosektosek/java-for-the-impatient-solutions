package com.company.r06.programowanie_uogolnione.code.sec03;

import java.util.ArrayList;

/**
 * @author Kamil
 */
public class Closeables {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        for (T elem : elems) elem.close();
    }
}
