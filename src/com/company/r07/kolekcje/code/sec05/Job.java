package com.company.r07.kolekcje.code.sec05;

/**
 * @author Kamil
 */
public class Job implements Comparable<Job> {
    private int priority;
    private String description;

    public Job(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int compareTo(Job o) {
        return priority - o.priority;
    }
}
