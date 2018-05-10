package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
