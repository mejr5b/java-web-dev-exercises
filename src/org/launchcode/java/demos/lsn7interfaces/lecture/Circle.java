package org.launchcode.java.demos.lsn7interfaces.lecture;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
