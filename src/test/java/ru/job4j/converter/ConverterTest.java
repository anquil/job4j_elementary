package ru.job4j.converter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int outEuro = Converter.rubleToEuro(in);
        Assertions.assertEquals(expected, outEuro);
    }

    @Test
    public void whenConvert180rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assertions.assertEquals(expected, out);
    }
}