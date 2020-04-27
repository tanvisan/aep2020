package edu.berkeley.aep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void defineACircumcircleOfATriangle() {
        var triangle = new Triangle(5, 12, 13);
        var circle = new Circle(65/10);
        assertEquals(circle, triangle.outcircle());
    }

    @Test
    public void AreaofIncircleLessThanAreaOfTriangle() {
        var triangle = new Triangle(5, 12, 13);
        var incircle = triangle.incircle();
        var areaTriangle = triangle.area();
        var areaIncircle = incircle.area();
        var circleObj = new Circle(2);
        assertTrue(areaIncircle < areaTriangle);
        assertEquals(incircle, circleObj);
    }
}
