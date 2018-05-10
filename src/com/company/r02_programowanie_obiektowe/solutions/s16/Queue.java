package com.company.r02_programowanie_obiektowe.solutions.s16;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Kamil
 */
public class Queue {

    private static class Node {

    }

    List<Node> nodes = new LinkedList<>();
    public void add() {
        this.nodes.add(new Node());
    }

    public void remove() {
        if(!this.nodes.isEmpty())
        this.nodes.remove(nodes.get(0));
    }
}
