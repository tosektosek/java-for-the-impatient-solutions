package com.company.r02_programowanie_obiektowe.solutions.s09;

/**
 * @author Kamil
 */
public class Car {
    private double fuel;
    private double literPer100km;
    private double distance = 0;

    public Car(double fuel, double literPer100km) {
        this.fuel = fuel;
        this.literPer100km = literPer100km;
    }

    public void tank(double fuel){
        this.fuel += fuel;
    }

    public void drive(double distance) {
        //100km; 5/100 50 45
        //45 = 50 - 5/100 * 100
        this.fuel = literPer100km/100 * distance;

        this.distance += distance;
    }

    public double getFuel() {
        return fuel;
    }

    public double getLiterPer100km() {
        return literPer100km;
    }

    public double getDistance() {
        return distance;
    }

    public static void main(String[] args) {
        Car car = new Car(50, 7);
        car.drive(200);
        System.out.println(car.distance + "  " + car.fuel);
        car.drive(500);
        System.out.println(car.distance + "  " + car.fuel);
        car.tank(10);
        System.out.println(car.distance + "  " + car.fuel);
    }
}
