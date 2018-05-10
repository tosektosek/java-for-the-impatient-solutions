package com.company.r07.kolekcje.code.scratch;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kamil
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Integer> h = new HashMap<>();
        h.put("a", null);
        System.out.println(h.keySet());
        h.compute("a", (k,v) -> null);
        System.out.println(h.keySet());
    }
}
