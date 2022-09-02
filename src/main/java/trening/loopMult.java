package trening;
// Даны два целых числа a и b (a < b). Найти произведение всех целых чисел от a до b включительно.
public class loopMult {
    public static void main(String[] args) {
        int a = 1;
        int b = 15;
        int mult = a++;
        for (int index = a; index<=b; index++) {
            mult = mult * index;
        }

        System.out.println(mult);

    }
}
