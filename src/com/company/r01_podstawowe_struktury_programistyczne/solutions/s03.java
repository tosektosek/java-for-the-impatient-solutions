package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.Scanner;

public class s03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//
//        int max = (a > b) ? a : b;
//        max = (max > c) ? max : c;
//
//        System.out.println(max);

        int max = Math.max(a, b);
        max = Math.max(max, c);

        System.out.println(max);

    }

}
