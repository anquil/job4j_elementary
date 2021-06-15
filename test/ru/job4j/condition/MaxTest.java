package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void maxNumber() {
        int left = 2;
        int right = 5;
        int expected = 5;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }
}