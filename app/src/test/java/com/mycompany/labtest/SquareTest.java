package com.mycompany.labtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

    @Test
    public void testSquare() {
        Square square = new Square("Square", new GreenColor());
        assertEquals("Square", square.getName());
    }

    @Test
    public void testGetArea() {
        Square square = new Square("Square", new GreenColor());
        square.setSide(10);
        assertEquals(100.0, square.getArea(), 0.0);
    }

    @Test
    public void testGetPerimeter() {
        Square square = new Square("Square", new GreenColor());
        square.setSide(10);
        assertEquals(40.0, square.getPerimeter(), 0.0);
    }

}