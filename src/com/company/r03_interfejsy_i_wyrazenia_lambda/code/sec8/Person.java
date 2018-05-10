package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec8;

/**
 * @author Kamil
 */
public class Person {
    private String first;
    private String middle;
    private String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Person(String first, String middle, String last) {

        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {

        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String getName() {
        if (middle == null) {
            return first + " " + last;
        }
        else {
            return first + " " + middle + " " + last;
        }
    }

    public String toString() {
        return getName();
    }
}
