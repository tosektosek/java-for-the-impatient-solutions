package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec04;

import java.util.Objects;

/**
 * @author Kamil
 */
public class ClassDemo {
    public static void main(String[] args)  throws ReflectiveOperationException{
        Object obj = System.out;
        Class<?> cl = obj.getClass();

        System.out.println("This object is an instance of " + cl.getName());

        String className = "java.util.Scanner";
        cl = Class.forName(className);

        cl = java.util.Scanner.class;
        System.out.println(cl.getName());
        Class<?> cl5 = void.class;
        System.out.println(cl5.getName());
    }
}
