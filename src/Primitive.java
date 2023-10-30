public class Primitive {
    public static void main(String[] args) {
        // Задаем целочисленные типы данных
        int intValue = 41;
        byte byteValue = 126;
        short shortValue = 1001;
        long longValue = 1234567889L;

        // Задаем данные с плавающей запятой
        float floatValue = 3.13f;
        double doubleValue = 2.71827;

        // Задаем char для символов
        char charValue = 'a';

        // Задаем тип boolean
        boolean booleanValue = true;

        // тут выводим строку, которая будет добавляться к другим
        String stringValue = "Hello, datatype";

        // Здесь пишем вывод всего в консоль (возможно не совсем поняла задание,
        // поэтому будет вывод двух вариантов)
        // Вариант 1 (типы данных + строка)
        System.out.println(stringValue + " int: "  + intValue );
        System.out.println(stringValue + " byte: "  + byteValue );
        System.out.println(stringValue + " short: "  + shortValue );
        System.out.println(stringValue + " long: "  + longValue );
        System.out.println(stringValue + " float: "  + floatValue );
        System.out.println(stringValue + " double: " + doubleValue );
        System.out.println(stringValue + " char: "  + charValue );
        System.out.println(stringValue + " boolean: " + booleanValue );
        System.out.println("String: " + stringValue);
        // Вариант 2 (только типы данных)
        System.out.println("int: " + intValue );
        System.out.println("byte: " + byteValue );
        System.out.println("short: "+ shortValue );
        System.out.println("long: "+ longValue );
        System.out.println("float: "+ floatValue );
        System.out.println("double: "+ doubleValue );
        System.out.println("char: "+ charValue );
        System.out.println("boolean: "+ booleanValue );
        System.out.println("String: " + stringValue);
    }
}
