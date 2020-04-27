package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;
import java.lang.*;

// Understands a three-sided enclosed polygon
public class Triangle {

    public final int s1;
    public final int s2;
    public final int s3;

    public static Triangle createTriangleFromSides(int s1, int s2, int s3) {

        return new Triangle(s1, s2, s3);

    }

    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int area() {
        float sp = (s1 + s2 + s3) / 2;
        var area = Math.sqrt(sp*(sp - s1)*(sp - s2)*(sp - s3));
        return (int) area;
    }

    public int perimeter() {

        return s1 + s2 + s3;
    }
}
