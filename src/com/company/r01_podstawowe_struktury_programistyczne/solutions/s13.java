package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.ArrayList;
import java.util.Collections;

public class s13 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i < 50; i++){
            list.add(i);
        }

        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Collections.shuffle(list);
            results.add(list.get(0));
            list.remove(0);
        }
        Collections.sort(results);
        results.forEach(s->{
            System.out.println(s);
        });
    }
}
