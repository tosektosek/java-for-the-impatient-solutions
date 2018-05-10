package com.company.r02_programowanie_obiektowe.solutions.s06;

/**
 * @author Kamil
 */
public class S06 {
    public static void main(String[] args) {
        newPoint p = new newPoint(3, 4).translate(1, 3).scale(0.5);
        System.out.printf(p.toString());
    }


 private static class newPoint {
     private double x;
     private double y;

     public newPoint() {
     }

     public newPoint(double x, double y) {

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

     /**
      *
      * @param x add value of <strong>x</strong>
      * @param y add value of <strong>y</strong>
      * @return edited Point
      */
     public newPoint translate(double x, double y) {
         this.x += x;
         this.y += y;
         return this;
     }

     /**
      * multiply <strong>x</strong> and <strong>y</strong>
      * @param scale multiplier
      * @return modified Point
      */
     public newPoint scale(double scale) {
         this.x *= scale;
         this.y *= scale;
         return this;
     }

     @Override
     public String toString() {
         return "newPoint{" +
                 "x=" + x +
                 ", y=" + y +
                 '}';
     }
 }
}
