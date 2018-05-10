package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.Random;

public class s10 {
    public static void main(String[] args) {
        Random random = new Random();
        long value = random.nextLong();
        System.out.println("" + value + " " + Long.toString(value, 36));
    }
}
