package edu.berkeley.aep;

import java.lang.*;

//Understands a circle with a radius
public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * (radius * radius);
    }
}
