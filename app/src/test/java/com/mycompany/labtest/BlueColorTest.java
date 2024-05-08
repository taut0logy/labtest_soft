package com.mycompany.labtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlueColorTest {

    @Test
    public void testBlueColor() {
        BlueColor blueColor = new BlueColor();
        assertEquals("Blue", blueColor.showColor());
    }

}