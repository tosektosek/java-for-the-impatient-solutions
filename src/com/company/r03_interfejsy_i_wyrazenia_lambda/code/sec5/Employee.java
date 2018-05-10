package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec5;

/**
 * @author Kamil
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this(name, 0);
    }

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
