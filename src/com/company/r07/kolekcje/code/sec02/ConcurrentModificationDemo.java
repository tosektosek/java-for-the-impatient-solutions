package com.company.r07.kolekcje.code.sec02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Kamil
 */
public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Peter");
        coll.add("Paul");
        coll.add("Mary");
        System.out.println(coll);
        Iterator<String> iter1 = coll.iterator();
        Iterator<String> iter2 = coll.iterator();
        iter2.next();
        iter2.remove();
        System.out.println(coll);
        iter1.next();
        System.out.println(coll);

    }
}
