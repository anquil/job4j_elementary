package ru.job4j.converter;

public class Conventer {
    public static float rubleToEuro(float value){
        return value / 70;

    }
    public static float rubleToDollar(float value){
        return value / 60;
    }
    public static void main(String [] args) {
        float euro = Conventer.rubleToEuro(140);
        float dollar = Conventer.rubleToDollar(140);
        System.out.println("140 rubles are " +  euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");

    }

}

