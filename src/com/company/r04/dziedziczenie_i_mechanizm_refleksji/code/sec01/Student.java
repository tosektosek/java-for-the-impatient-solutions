package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class Student extends Person implements Named {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
