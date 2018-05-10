package com.company.r02_programowanie_obiektowe.solutions.s04;

/**
 * @author Kamil
 */
public class S04 {
    private static class IntHolder {
        private int value;

        public IntHolder(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%d", this.value);
        }
    }

    public static void main(String[] args) {
        IntHolder a = new IntHolder(11);
        IntHolder b = new IntHolder(15);
        swapTwoIntegers(a,b);
        System.out.println(a.getValue());

    }

    public static void swapTwoIntegers(IntHolder a, IntHolder b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
}
