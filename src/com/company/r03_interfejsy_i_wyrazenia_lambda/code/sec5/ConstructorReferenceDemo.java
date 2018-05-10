package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec5;

import java.util.ArrayList;

/**
 * @author Kamil
 */
public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Peter");
        names.add("Paul");
        names.add("Mary");
        Employee[] employees = names
                .stream()
                .map(Employee::new)
                .toArray(Employee[]::new);
        for (Employee e : employees) System.out.println(e.getName());
    }
}
