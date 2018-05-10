package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec02;

public interface Identified {
    default int getId() { return Math.abs(hashCode()); }
}
