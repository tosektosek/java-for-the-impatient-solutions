package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.Scanner;

public class s08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str.trim();
        String[] strArray = str.split(" ");

        for (String s : strArray)
            s.trim();

        for (String s : strArray){
            if(!s.equals(""))
            System.out.println(s);
        }
    }
}
