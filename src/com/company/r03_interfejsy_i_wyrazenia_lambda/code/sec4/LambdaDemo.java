package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author Kamil
 */
public class LambdaDemo {
    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary"};
        Arrays.sort(friends,
                (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(friends));

        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        //enemies.removeIf(e -> e==null);
        enemies.removeIf(Objects::isNull);
        System.out.println(enemies);
    }
}
