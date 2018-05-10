package com.company.r06.programowanie_uogolnione.solutions.s02;

/**
 * @author Kamil
 */
public class Stack<E> {
    private E[] stack;

    private int index;
    private final int initSize = 100;
    private int stackSize;
    private Class<E> cl;

    @SuppressWarnings("unchecked")
    public Stack(Class<E> cl) {
        index = 0;
        stackSize = initSize;
        this.cl = cl;
        stack = (E[])java.lang.reflect.Array.newInstance(cl, initSize);
    }

    public void push(E element) {
        if (index == stackSize) {
            extendStack();
        }

        stack[index] = element;
        index++;
    }

    public E pop() throws Exception {
        if (index < 0) {
            throw new Exception("Stos jest pusty.");
        } else {
            index--;
            E element = stack[index];
            return element;
        }
    }

    @SuppressWarnings("unchecked")
    private void extendStack() {
        stackSize += initSize;
        E[] newStack = (E[])java.lang.reflect.Array.newInstance(cl, stackSize);
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }

        stack = newStack;
    }
}