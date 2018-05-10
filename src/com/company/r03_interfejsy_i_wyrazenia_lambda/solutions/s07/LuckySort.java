package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Kamil
 */
public class LuckySort {

    public void luckySort(List<String> strings, Comparator<String> comp) {

        ArrayList<String> result = new ArrayList<>(strings);
        result.sort(comp);
        int i = 0;
        while (!result.equals(strings)){
            Collections.shuffle(strings);
            i++;
        }
        System.out.println("Posortowano za " + i + " razem.");

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kamil");
        list.add("Michal");
        list.add("Zygmunt");
        list.add("Anna");
        list.add("Aniina");
        list.add("barbra");
        list.add("Nara");

        LuckySort luckySort = new LuckySort();

        luckySort.luckySort(list, (String::compareTo));
    }
}
