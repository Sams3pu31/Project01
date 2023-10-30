public class TrainingJavaStroke {
    public static void main(String[] args) {
        String string = "Training Java";

        // Получим длину строки из строки выше
        int length = string.length();

        // Получим символ на 5-й позиции (индекс 4, так как отсчет идет с нуля)
        char Char = string.charAt(4);

        // Выведем длину и символ, находящийся на 5-й позиции
        System.out.println("Длина строки: " + length);
        System.out.println("Символ на 5-й позиции: " + Char);

        // Добавим сегодняшнюю дату к исходной строке
        String data = "30.10.2023";
        String result = string + " " + data;

        // Выведем результат на экран
        System.out.println("Результат с добавленной датой: " + result);
    }
}
