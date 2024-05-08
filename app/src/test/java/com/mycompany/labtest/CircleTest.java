package com.mycompany.labtest;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void testCircle() {
        Circle circle = new Circle("Circle", new GreenColor());
        Assert.assertEquals("Circle", circle.getName());
    }

    @Test
    public void testGetArea() {
        Circle circle = new Circle("Circle", new GreenColor());
        Assert.assertEquals(0.0, circle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Circle circle = new Circle("Circle", new GreenColor());
        Assert.assertEquals(0.0, circle.getPerimeter());
    }

}