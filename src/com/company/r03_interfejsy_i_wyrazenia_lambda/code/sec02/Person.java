package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec02;

public interface Person {
    String getName();
    default int getId() { return 0; }
}
