package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec03;

public enum Modifier {
    PUBLIC, PRIVATE, PROTECTED, STATIC, FINAL, ABSTRACT;
    private int mask;

    static {
        int maskBit = 1;
        for (Modifier m : Modifier.values()) {
            m.mask = maskBit;
            maskBit *= 2;
        }
    }

    public int getMask() {
        return mask;
    }
}
