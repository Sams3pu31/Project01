public class RightTriangle {
    public static void main(String[] args) {
        double katet1 = 5;
        double katet2 = 8;

        // Найдем гипотенузу
        double hypotenuse = Math.sqrt(katet1 * katet1 + katet2 * katet2);
        System.out.println("Гипотенуза равна: " + hypotenuse);
        // Вычислим площадь
        double area = (katet1 * katet2) / 2;

        // Вычислим периметр
        double perimeter = katet1 + katet2 + hypotenuse;

        // Выведем результаты

        System.out.println("Площадь треугольника: " + area);
        System.out.println("Периметр треугольника: " + perimeter);
    }}
