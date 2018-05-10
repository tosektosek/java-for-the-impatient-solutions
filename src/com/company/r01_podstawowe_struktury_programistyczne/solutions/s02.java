package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.Scanner;

public class s02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angle = in.nextInt();

        System.out.printf("%d\n", angle % 360);
        System.out.printf("%d\n", Math.floorMod(angle, 360));

    }
}
