package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s14;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Kamil
 */
public class Employee {
    private String name;
    private double salary;

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

    public static void main(String[] args) {
        Employee mary = new Employee("Mary", 2500);
        Employee max = new Employee("max", 85520);
        Employee tom = new Employee("tom", 200);
        Employee michael = new Employee("michael", 450);

        Employee[] employees = new Employee[]{
                mary, max, tom, michael
        };

        Arrays.sort(employees,
                Comparator
                .comparingDouble(Employee::getSalary)
                .thenComparing(Employee::getName));

        Arrays.sort(employees,
                Comparator
        .comparing(Employee::getName)
        .thenComparingDouble(Employee::getSalary));
        Arrays.asList(employees).stream().forEach(employee -> System.out.println(employee.getName()));
    }
}
