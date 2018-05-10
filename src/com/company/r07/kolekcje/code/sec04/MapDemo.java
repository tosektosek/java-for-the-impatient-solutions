package com.company.r07.kolekcje.code.sec04;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kamil
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> counts = new HashMap<>();
        counts.put("Alice", 1);
        counts.put("Alice", 2);

        int count = counts.get("Alice");
        System.out.println(count);
        count = counts.getOrDefault("Barney", 0);
        System.out.println(count);

        String word = "Fred";
        counts.merge(word, 1, Integer::sum);
        counts.merge(word, 1, Integer::sum);
        System.out.println(counts.get(word));

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            process(key, value);
        }
//        counts.forEach((k, v) -> process(k,v));
        counts.forEach(MapDemo::process);
    }

    public static void process(String key, Integer value) {
        System.out.printf("Processing key %s and value %d\n", key, value);
    }
}
