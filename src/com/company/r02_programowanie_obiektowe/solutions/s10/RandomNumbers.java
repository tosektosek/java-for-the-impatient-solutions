package com.company.r02_programowanie_obiektowe.solutions.s10;

import java.util.List;
import java.util.Random;

/**
 * @author Kamil
 */
public class RandomNumbers {
    private static Random generator = new Random();
    public static int randomElement(int[] data) {
        if (data.length == 0)
            return 0;
        int pos = generator.nextInt(data.length);
        return data[pos];
    }

    public static int randomElement(List<Integer> list) {
        if (list.size() == 0)
            return 0;
        int pos = generator.nextInt(list.size());
        return list.get(pos);
    }
}