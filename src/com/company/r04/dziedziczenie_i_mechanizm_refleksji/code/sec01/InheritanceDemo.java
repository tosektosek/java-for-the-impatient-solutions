package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec01;

/**
 * @author Kamil
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Manager boss =new Manager("Fred", 20000);
        boss.setBonus(1000);
        System.out.println(boss.getSalary());
        boss.raiseSalary(5);
        System.out.println(boss.getSalary());
        Employee emp = boss;
        emp.raiseSalary(5);
        System.out.println(emp.getSalary());

        if (emp instanceof Manager) {
            Manager mgr = (Manager) emp;
            mgr.setBonus(2000);
        }
    }
}
