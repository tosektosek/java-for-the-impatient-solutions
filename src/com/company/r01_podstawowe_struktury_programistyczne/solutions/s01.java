package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.Scanner;

public class s01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        System.out.printf(Integer.toBinaryString(value));
        System.out.printf("Octal: %o\n", value);
        System.out.printf("%x\n", value);
        double reciprocal = 1.0/value;
        System.out.printf("%a\n", reciprocal);
    }
}
