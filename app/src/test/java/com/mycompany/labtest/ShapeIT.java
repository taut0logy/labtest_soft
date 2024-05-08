package com.mycompany.labtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeIT {

    @Test
    public void testColorShape() {
        ColorShapeFactory factory=new ColorShapeFactory();

        Shape colorShape=factory.getShape("Circle", "Red");
        boolean a=colorShape.getColor().showColor().equalsIgnoreCase("Red");
        boolean b=colorShape.getName().equalsIgnoreCase("Circle");
        assertTrue(a && b);
    }
}
