package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class PointTest {

    @Test
    public void when12To30Then2p82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50To10Then4() {
        double expected = 4;
        int x1 = 5;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50To10Then6() {
        double expected = 6;
        int x1 = 8;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }
}