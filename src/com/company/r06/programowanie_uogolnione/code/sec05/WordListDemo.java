package com.company.r06.programowanie_uogolnione.code.sec05;

import java.util.ArrayList;

/**
 * @author Kamil
 */
public class WordListDemo {
    public static void main(String[] args) {
        WordList words = new WordList();
        ArrayList<String> strings = words;
        strings.add("Hello");
        strings.add("C++");
        System.out.println(words);
    }
}
