package edu.berkeley.aep;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.lang.*;

// Understands a three-sided enclosed polygon
public class Triangle {

    public final int s1;
    public final int s2;
    public final int s3;

    public static Triangle createTriangleFromSides(int s1, int s2, int s3) throws Exception {

        return new Triangle(s1, s2, s3);

    }

    public Triangle(int s1, int s2, int s3) {
//            throws Exception {
//        if ((s1 + s2 < s3) | (s1 + s3 < s2) | (s2 + s3 < s1)) {
//            throw new Exception();
//        }
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    protected int area() {
        float sp = (s1 + s2 + s3) / 2;
        var area = Math.sqrt(sp*(sp - s1)*(sp - s2)*(sp - s3));
        return (int) area;
    }

    protected int perimeter() {

        return s1 + s2 + s3;
    }

    public Circle incircle() {
        double sp = (s1 + s2 + s3) / 2;
        double inradius = this.area()/sp;
        return new Circle(inradius);
    }
}
