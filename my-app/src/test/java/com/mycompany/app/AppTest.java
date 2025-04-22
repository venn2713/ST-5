package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final double delta = 1e-7;

    @Test
    public void testSqrtOf1_0() {
        assertEquals(1.0, new Sqrt(1.0).calc(), delta);
    }

    @Test
    public void testSqrtOf16() {
        assertEquals(4.0, new Sqrt(16.0).calc(), delta);
    }

    @Test
    public void testSqrtOf0_01() {
        assertEquals(0.1, new Sqrt(0.01).calc(), delta);
    }

    @Test
    public void testSqrtOf7() {
        assertEquals(Math.sqrt(7.0), new Sqrt(7.0).calc(), delta);
    }

    @Test
    public void testSqrtOf0_5() {
        assertEquals(Math.sqrt(0.5), new Sqrt(0.5).calc(), delta);
    }

    @Test
    public void testSqrtOf25() {
        assertEquals(5.0, new Sqrt(25.0).calc(), delta);
    }

    @Test
    public void testSqrtOf81() {
        assertEquals(9.0, new Sqrt(81.0).calc(), delta);
    }

    @Test
    public void testSqrtOf0_0004() {
        assertEquals(0.02, new Sqrt(0.0004).calc(), delta);
    }

    @Test
    public void testSqrtOf200() {
        assertEquals(Math.sqrt(200.0), new Sqrt(200.0).calc(), delta);
    }

    @Test
    public void testSqrtOf9999() {
        assertEquals(Math.sqrt(9999.0), new Sqrt(9999.0).calc(), delta);
    }

    @Test
    public void testSqrtOf8_64() {
        double arg = 8.64;
        double result = new Sqrt(arg).calc();
        assertTrue(Math.abs(result * result - arg) < delta);
    }

    @Test
    public void testSqrtOf1e_10() {
        double arg = 1e-10;
        double result = new Sqrt(arg).calc();
        assertTrue(Math.abs(result * result - arg) < delta);
    }

    @Test
    public void testSqrtOf1e7() {
        assertEquals(3162.2776601683795, new Sqrt(1e7).calc(), delta);
    }

    @Test
    public void testSqrtOfDecimal() {
        double arg = 6.7;
        double result = new Sqrt(arg).calc();
        assertEquals(Math.sqrt(arg), result, delta);
    }

    @Test
    public void testSqrtAlwaysNonNegative() {
        double result = new Sqrt(121.0).calc();
        assertTrue(result >= 0.0);
    }
}
