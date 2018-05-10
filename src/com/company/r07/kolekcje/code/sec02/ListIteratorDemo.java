package com.company.r07.kolekcje.code.sec02;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Kamil
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> friends =  new LinkedList<>();
        ListIterator<String> iter = friends.listIterator();
        iter.add("Fred");
        iter.add("Wilma");
        iter.previous();
        iter.add("Barny");
        System.out.println(friends);
    }
}
