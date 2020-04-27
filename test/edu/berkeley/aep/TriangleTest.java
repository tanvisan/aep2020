package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void triangleWithUnitSidesShouldHavePerimeterThree() {
        var triangle = new Triangle(1, 1, 1);
        assertEquals(3, triangle.perimeter());
    }
}
