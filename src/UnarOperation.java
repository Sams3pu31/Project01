public class UnarOperation {
    public static void main(String[] args) {
        int x = 50;
        int y = 20;

        // Увеличиваем переменную x на 1
        x++;

        // Уменьшаем переменную y на 1
        y--;

        // Проверяем условие x >= 51 или y < 22
        boolean condition = (x >= 51) || (y < 22);

        // Выводим результат проверки условия на экран
        System.out.println("Результат x++: " + x);
        System.out.println("Результат y--: " + y);
        System.out.println("Результат проверки условия: " + condition);
    }}
