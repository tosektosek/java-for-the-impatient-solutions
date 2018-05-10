package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

/**
 * @author Kamil
 */
public class Employee implements Measurable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getMeasure() {
        return this.salary;
    }


    public double average(Measurable[] objects) {
        OptionalDouble result = Arrays.asList(objects)
                .parallelStream()
                .mapToDouble(Measurable::getMeasure).average();
        if(result.isPresent())
        return result.getAsDouble();
        else return 0;
    }

    public Measurable largest(Measurable[] objects) {
        return Arrays.asList(objects)
                .parallelStream()
                .max(Comparator.comparingDouble(Measurable::getMeasure))
                .get();
    }
}
