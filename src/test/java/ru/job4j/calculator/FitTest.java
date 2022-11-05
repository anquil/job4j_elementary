package ru.job4j.calculator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assertions.assertEquals(expected, out, 0.01);
    }
}