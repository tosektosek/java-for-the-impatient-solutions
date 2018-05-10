package com.company.r06.programowanie_uogolnione.code.sec04;

import java.util.function.Predicate;

/**
 * @author Kamil
 */
public class Arrays {
    public static <T> void printAll(T[] elements, Predicate<? super T> filter){
        for (T e : elements)
            if (filter.test(e))
                System.out.println(e.toString());
    }
}
