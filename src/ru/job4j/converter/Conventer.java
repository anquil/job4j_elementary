package ru.job4j.converter;

public class Conventer {
    public static float rubleToEuro(float value){
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToDollar(float value){
        float rsl = value / 60;
        return rsl;
    }
    public static void main(String [] args) {
        float euro = Conventer.rubleToEuro(130);
        float dollar = Conventer.rubleToDollar(140);
        String euroF = String.format("%.2f",euro);
        String dollarF = String.format("%.2f",dollar);
        System.out.println("140 rubles are " +  euroF + " euro");
        System.out.println("140 rubles are " + dollarF + " dollar");

    }

}

