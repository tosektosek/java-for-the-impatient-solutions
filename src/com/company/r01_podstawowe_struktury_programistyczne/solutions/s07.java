package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.Scanner;

public class s07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        short x = in.nextShort();
        short y = in.nextShort();

        short sum = (short) (x + y);
        System.out.println(sum);

    }
}
