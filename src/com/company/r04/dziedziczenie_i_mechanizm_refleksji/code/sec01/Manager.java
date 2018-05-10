package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary) {
        super(name, salary);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() { // Overrides superclass method
        return super.getSalary() + bonus;
    }
}
