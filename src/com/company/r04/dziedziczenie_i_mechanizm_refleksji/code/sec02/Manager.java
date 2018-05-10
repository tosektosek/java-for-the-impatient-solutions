package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec02;

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

    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }

    public Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }
}