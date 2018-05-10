package com.company.r06.programowanie_uogolnione.solutions.s07;

import java.util.List;

/**
 * @author Kamil
 */
public class Pair<E extends Comparable<E>> {

    E first;
    E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E getMax(E first, E second) {
       return first.compareTo(second) < 0 ? second : first;
    }

    public E getMin(E first, E second) {
        return first.compareTo(second) > 0 ? second : first;
    }
}
