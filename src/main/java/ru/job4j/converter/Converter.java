package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inDollar = 180;
        int inEuro = 120;
        int outDollar = Converter.rubleToDollar(inDollar);
        int outEeuro = Converter.rubleToEuro(inEuro);
        System.out.println("140 rubles are " +  outEeuro + " euro. ");
        System.out.println("120 rubles are " + outDollar + " dollar. ");
    }
}

