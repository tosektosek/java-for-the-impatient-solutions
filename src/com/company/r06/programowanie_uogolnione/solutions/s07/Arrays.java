package com.company.r06.programowanie_uogolnione.solutions.s07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil
 */
public class Arrays {

    public static <E  extends Comparable<E>> Pair<E> firstLast(List<Pair<E>> a) {
        Pair<E> pair = new Pair<E>(a.get(0).first, a.get(a.size()-1).second);
        return pair;
    }

}
