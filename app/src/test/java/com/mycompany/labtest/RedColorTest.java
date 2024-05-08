package com.mycompany.labtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedColorTest {

        @Test
        public void testRedColor() {
            RedColor redColor = new RedColor();
            assertEquals("Red", redColor.showColor());
        }
}