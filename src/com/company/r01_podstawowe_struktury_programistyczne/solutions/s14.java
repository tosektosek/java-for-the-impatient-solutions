package com.company.r01_podstawowe_struktury_programistyczne.solutions;

import java.util.ArrayList;
import java.util.Scanner;


public class s14 {
    static int suma = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        while (in.hasNextLine()) {
            String[] s = in.nextLine().split(" ");
            if(s[0].equals("")) break;
            ArrayList<Integer> temp = new ArrayList<>();
            for(String str : s) {
                if(!str.equals(""))
                temp.add(Integer.parseInt(str));
            }

            list.add(temp);
        }

                list.get(0).forEach(value ->{
            suma += value;
        });

        boolean rowEquals = isRowEquals(list);
        boolean columnsEquals = isColumnsEquals(list);

        if(rowEquals && columnsEquals)
            System.out.println("TAAAK");
    }

    public static boolean isRowEquals(ArrayList<ArrayList<Integer>> list) {

        for(ArrayList<Integer> integers : list) {
            int check = 0;
            for(Integer i : integers) {
                check += i;
            }
            if (suma != check) {
                return false;
            }
        }
        return true;
    }

    public static boolean isColumnsEquals(ArrayList<ArrayList<Integer>> list) {

        for (int i = 0; i < list.size(); i++) {
            int check = 0;
            for (int j = 0; j < list.size(); j++) {
                check += list.get(j).get(i);
            }
            if (check != suma)
                return false;
        }
        return true;
    }


}
