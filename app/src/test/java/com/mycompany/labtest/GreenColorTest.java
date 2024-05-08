package com.mycompany.labtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreenColorTest {

    @Test
    public void testGreenColor() {
        GreenColor greenColor = new GreenColor();
        assertEquals("Green", greenColor.showColor());
    }

}