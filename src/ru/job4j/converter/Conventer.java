package ru.job4j.converter;

public class Conventer {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int inDollar = 120;
        int inEuro = 140;
        float outDollar = Conventer.rubleToDollar(inDollar);
        float outEeuro = Conventer.rubleToEuro(inEuro);
        boolean passedD = outDollar == 2;
        boolean passedE = outEeuro == 2;
        System.out.println("140 rubles are " +  outEeuro + " euro. " + "test result: " + passedE);
        System.out.println("120 rubles are " + outDollar + " dollar. " + "test result: " + passedD);
    }

}

