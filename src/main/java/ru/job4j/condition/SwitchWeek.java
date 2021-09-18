package ru.job4j.condition;

public class SwitchWeek {
    public static String name(int day) {
        String name;
        switch (day) {
            case 1:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятницв";
                break;
            case 6:
                name = "суббота";
                break;
            case 7:
                name = "Воскресенье";
                break;
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        String res = SwitchWeek.name(3);
        System.out.println(res);
    }
}
