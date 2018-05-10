package com.company.r04.dziedziczenie_i_mechanizm_refleksji.solutions.s04;

import com.company.r04.dziedziczenie_i_mechanizm_refleksji.solutions.s01.Point;

/**
 * @author Kamil
 */
public class Circle extends Shape {
    public Circle(Point point) {
        super(point);
    }

    @Override
    Point getCenter() {
        return null;
    }

    public Circle(Point center, double radius) {
        super(center);
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle)super.clone();
    }
}
