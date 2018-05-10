package com.company.r06.programowanie_uogolnione.solutions.s01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil
 */
public class Stack<E> {
    private List<E> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void push(E element) {
        stack.add(element);
    }

    public E pop() throws Exception {
        if (this.stack.size() == 0) {
            throw new Exception("Stos jest pusty");
        } else {
            E element = stack.get(stack.size() - 1);
            stack.remove(element);
            return element;
        }
    }

    public boolean isEmpty() {
        return this.isEmpty();
    }
}
