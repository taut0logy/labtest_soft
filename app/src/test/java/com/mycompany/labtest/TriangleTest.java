package com.mycompany.labtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle("Triangle", new GreenColor());
        assertEquals("Triangle", triangle.getName());
    }

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle("Triangle", new GreenColor());
        triangle.setBase(10);
        triangle.setHeight(10);
        assertEquals(50.0, triangle.getArea(), 0.0);
    }

    @Test
    public void testGetPerimeter() {
        Triangle triangle = new Triangle("Triangle", new GreenColor());
        triangle.setBase(3);
        triangle.setHeight(4);
        assertEquals(12.0, triangle.getPerimeter(), 0.0);
    }
}