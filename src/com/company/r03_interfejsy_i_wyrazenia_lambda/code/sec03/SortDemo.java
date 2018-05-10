package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec03;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Kamil
 */
public class SortDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends); // friends is now ["Mary", "Paul", "Peter"]
        System.out.println(Arrays.toString(friends));

        friends = new String[] { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, new LengthComparator());
        System.out.println(Arrays.toString(friends));

        friends = new String[] { "Peter", "Paul", "Mary" };
        Arrays.sort(friends, (f1, f2)->{
            return f1.length() - f2.length();
        });

        Arrays.sort(friends, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(friends));
    }
}

class LengthComparator implements Comparator<String> {
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}

