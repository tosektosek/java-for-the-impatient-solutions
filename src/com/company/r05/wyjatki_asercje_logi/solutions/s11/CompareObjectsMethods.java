package com.company.r05.wyjatki_asercje_logi.solutions.s11;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Kamil
 */
public class CompareObjectsMethods {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("as");
        list.add(null);


         Objects.requireNonNull(list.get(0));
         assert list.get(1) != null;
         assert list.get(0) != null;

    }
}
