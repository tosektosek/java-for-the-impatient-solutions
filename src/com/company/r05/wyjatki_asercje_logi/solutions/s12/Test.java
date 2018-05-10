package com.company.r05.wyjatki_asercje_logi.solutions.s12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author Kamil
 */
public class Test {
    public int min(Integer... values) {
        Integer m = Stream.of(values).sorted().findFirst().orElse(null);

        try {
            Objects.requireNonNull(m);
        } catch (NullPointerException ex) {
            System.out.println("Brak intów");
            return 0;
        }

        return m;
    }

    public static void main(String[] args) {
        Test test = new Test();

        int min = test.min();
        System.out.println(min);
    }
}
