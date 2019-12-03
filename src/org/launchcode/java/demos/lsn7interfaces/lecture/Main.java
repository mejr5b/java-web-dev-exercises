package org.launchcode.java.demos.lsn7interfaces.lecture;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        Shape[] shapes = {
                new Circle(4.0),
        new Rectangle(4.0, 2.0),
        new Square(5.0),
        new Triangle(4.0, 3.0)

        };
        Arrays.sort(shapes);

        for(Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
