package com.company.r06.programowanie_uogolnione.solutions.s06;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil
 */
public class Main<E> {

    public void addElements(List<? super E> a1, List<? extends E> a2) {
        a1.addAll(a2);

    }
}
