package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void triangleWithUnitSidesShouldHavePerimeterThree() {
        var triangle = new Triangle(1, 1, 1);
        assertEquals(3, triangle.perimeter());
    }

    @Test
    public void triangleWithZeroSidesShouldHaveAreaZero() {
        var triangle = new Triangle(0, 0, 0);
        assertEquals(0, triangle.area());
    }

    @Test
    public void triangleWithSidesShouldHaveArea() {
        var triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.area());
    }

    @Test
    public void defineAnIncircleOfATriangle() {
        var triangle = new Triangle(3, 4, 5);
        var circle = new Circle(6/6);
        assertEquals(circle, triangle.incircle());
    }
}
