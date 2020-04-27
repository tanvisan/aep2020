package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    private static final double DELTA = 1e-15;

    @Test
    public void defineACircleWithRadius(){
        var circle = new Circle(6);
    }

    @Test
    public void AreaofZeroCirlceIsZero(){
        var circle = new Circle(0);
        assertEquals(0, circle.area(), DELTA);
    }
}


