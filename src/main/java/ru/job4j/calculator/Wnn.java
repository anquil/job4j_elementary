package ru.job4j.calculator;
/* Необходимо реализовать метод так, чтобы при условии, что сумма выигрыша
(произведение вероятности и стоимости выигрыша) превышает цену игры, метод вернул разницу
 между этими величинами (т.е. чистую прибыль), или вернул 0 (при условии что чистая прибыль меньше или равна 0).
*/
public class Wnn {
    public static double checkGame(int percent, int prize, int pay) {
        double win = percent * prize;
        if (win > pay) {
            return win - pay;
        } else if ((win - pay) <= 0) {
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        double res = Wnn.checkGame(4, 2, 6);
        System.out.println(res);
    }
}
