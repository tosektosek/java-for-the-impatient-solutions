package com.company.r06.programowanie_uogolnione.solutions.s03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kamil
 */
public class Table<K, V> {

    static class Entry<K,V>{
        K key;
        V value;

        public Entry() {
        }

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    List<Entry<K, V>> list = new ArrayList<>();

    public V get(K key) {
        for(Entry<K, V> entry : list) {
            if (entry.getKey().equals(key))
                return entry.getValue();
        }
        return null;
    }

    public void add(K key, V value) {
        list.add(new Entry<>(key, value));
    }

    public void delete(K key) {
        for (Entry<K,V> e : list)
            if(e.getKey().equals(key))
                list.remove(e);
    }
}
