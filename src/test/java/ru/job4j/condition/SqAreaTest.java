package ru.job4j.condition;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2Square3() {
        int expected = 3;
        int p = 8;
        double k = 3;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K2Square4() {
        int expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }
}