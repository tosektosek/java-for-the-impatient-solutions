package com.company.r04.dziedziczenie_i_mechanizm_refleksji.solutions.s01;

/**
 * @author Kamil
 */
public class LabelPoint extends Point {

    private String label;

    public String getLabel() {
        return label;
    }

    public LabelPoint(double x, double y, String label) {

        super(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabelPoint{" +
                "label='" + label + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabelPoint that = (LabelPoint) o;

        return label != null ? label.equals(that.label) : that.label == null;
    }

    @Override
    public int hashCode() {
        return label != null ? label.hashCode() : 0;
    }
}
