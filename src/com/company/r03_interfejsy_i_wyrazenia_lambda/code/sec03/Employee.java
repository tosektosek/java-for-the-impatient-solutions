package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec03;

/**
 * @author Kamil
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(double salary) {
        this.name = "";
        this.salary = salary;
    }

    public Employee() {
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
