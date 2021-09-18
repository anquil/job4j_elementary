package ru.job4j.condition;

public class HelloW {
    public static String checkNumber(int number) {
        if (number % 3 == 0) {
            return "Hello";
        }
        if (number % 5 == 0) {
            return "World";
        }
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "Hello, World!!!";
        }
        return "Operation not support";
    }

    public static void main(String[] args) {
        String s = HelloW.checkNumber(10);
        System.out.println(s);
        String d = HelloW.checkNumber(9);
        System.out.println(d);
        String b = HelloW.checkNumber(25);
        System.out.println(b);
        String g = HelloW.checkNumber(14);
        System.out.println(g);
    }
}
