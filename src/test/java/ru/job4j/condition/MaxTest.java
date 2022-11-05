package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class MaxTest {

    @Test
    public void maxNumber() {
        int left = 2;
        int right = 5;
        int expected = 5;
        int rsl = Max.max(left, right);
        Assertions.assertEquals(expected, rsl);
    }

    @Test
    public void maxNumberLeft() {
        int left = 7;
        int right = 5;
        int expected = 7;
        int rsl = Max.max(left, right);
        Assertions.assertEquals(expected, rsl);
    }

    @Test
    public void rEquallyL() {
        int left = 8;
        int right = 8;
        int expected = 8;
        int rsl = Max.max(left, right);
        Assertions.assertEquals(expected, rsl);
    }
}