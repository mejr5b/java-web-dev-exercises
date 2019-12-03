package org.launchcode.java.demos.lsn7interfaces.lecture;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double area(){
        return this.length * this.width;
    }
}
