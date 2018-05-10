package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class StudentDemo {
    public static void main(String[] args) {
        Person p = new Student("Fred", 1729);
        System.out.println(p.getName());
        Student s = (Student) p;
        System.out.println(s.getName());
        Named n = s;
        System.out.println(n.getName());
    }
}
