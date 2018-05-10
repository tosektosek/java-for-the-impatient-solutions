package com.company.r04.dziedziczenie_i_mechanizm_refleksji.solutions.s04;

import com.company.r04.dziedziczenie_i_mechanizm_refleksji.solutions.s01.Point;

/**
 * @author Kamil
 */
public abstract class Shape {
    private Point point;

    public void moveBy(double dx, double dy) {
            point = new Point(point.getX() + dx, point.getY() + dy);
    }

    public Shape(Point point) {
        this.point = point;
    }

    abstract Point getCenter();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
