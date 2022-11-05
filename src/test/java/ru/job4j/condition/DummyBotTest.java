package ru.job4j.condition;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void wenUnknownBot() {
        String in = "сколько будет 3+2";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assertions.assertEquals(result, expected);
    }
}
