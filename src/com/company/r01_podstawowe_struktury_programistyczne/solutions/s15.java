package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class s15 {

    private final int n;
    public s15(int n) {
        this.n = n;
    }

    public ArrayList<ArrayList<Integer>> pascalTriangle() {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(this.n);
        for (int row = 0; row <= this.n; row++) {
            ArrayList<Integer> nextRow = new ArrayList<>(row+1);
            if (row ==0) {
                nextRow.add(1);
            } else if (row == 1) {
                nextRow.add(1);
                nextRow.add(1);
            } else {
                ArrayList<Integer> prev = result.get(row-1);
                nextRow.add(1);
                for (int pos = 1; pos < row; pos++) {
                    nextRow.add(prev.get(pos-1)+prev.get(pos));
                }
                nextRow.add(1);
            }
            result.add(nextRow);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        s15 s = new s15(n);
        ArrayList<ArrayList<Integer>> triangle = s.pascalTriangle();
        for (ArrayList<Integer> list : triangle) {
            for (Integer i : list) {
                System.out.printf("%d", i);
            }
            System.out.println();
        }
    }
}
