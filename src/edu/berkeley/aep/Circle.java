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

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (!(other instanceof Circle)) return false;
        return Double.compare(radius, ((Circle) other).radius) == 0;
    }
}
