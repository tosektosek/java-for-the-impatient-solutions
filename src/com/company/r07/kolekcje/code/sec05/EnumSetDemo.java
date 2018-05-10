package com.company.r07.kolekcje.code.sec05;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

/**
 * @author Kamil
 */
public class EnumSetDemo {
    enum Weekday {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY };

    public static void main(String[] args) {
        Set<Weekday> always = EnumSet.allOf(Weekday.class);
        Set<Weekday> never = EnumSet.noneOf(Weekday.class);
        Set<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
        Set<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);
        System.out.println(always);
        System.out.println(never);
        System.out.println(workday);
        System.out.println(mwf);

        EnumMap<Weekday, String> personInCharge = new EnumMap<Weekday, String>(Weekday.class);
        personInCharge.put(Weekday.MONDAY, "Fred");
        System.out.println(personInCharge);
    }
}
