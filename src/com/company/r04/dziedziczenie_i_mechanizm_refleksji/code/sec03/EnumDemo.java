package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec03;

import com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec03.Size;

/**
 * @author Kamil
 */
public class EnumDemo {
    public static void main(String[] args) {
        Size notMySize = Size.valueOf("SMALL");
        System.out.println(notMySize.getAbbreviation());

        for (Size s : Size.values()) {
            System.out.println(s);
        }

        System.out.println(Size.MEDIUM.ordinal());
    }
}
