package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assertions.assertTrue(result);
    }

    @Test
    public void whenDsntExist() {
        double ab = 7;
        double ac = 2;
        double bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assertions.assertFalse(result);
    }
}