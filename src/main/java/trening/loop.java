package trening;
// Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . , 5 кг конфет.
public class loop {
    public static void main(String[] args) {
        int price = 10;
        for (int index = 1; index <= 5; index++) {
            int total = price * index;
            System.out.println(total);
        }
    }
}
