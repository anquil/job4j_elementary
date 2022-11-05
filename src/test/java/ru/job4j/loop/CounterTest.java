package ru.job4j.loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CounterTest  {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void whenSumEvenNumbersFromThreeToNine() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assertions.assertEquals(expected, result);
    }
}