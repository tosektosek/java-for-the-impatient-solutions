package com.company.r02_programowanie_obiektowe.solutions.s05;

/**
 * @author Kamil
 */
public class S05 {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.printf("%.1f, %.1f", p.getX(), p.getY());
    }
}

final class Point{
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double scale) {
        return new Point(this.x * scale, this.y * scale);
    }
}
