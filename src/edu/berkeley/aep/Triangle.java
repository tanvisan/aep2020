package edu.berkeley.aep;

import java.util.HashMap;
import java.util.Map;

// Understands a three-sided figure 
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

    protected int area() {
        return 0;
    }

    public int perimeter() {
        return s1 + s2 + s3;
    }
}
