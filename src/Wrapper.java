public class Wrapper {
    public static void main(String[] args) {
        //Упаковываем целочисленные типы данных
        int a = 41;
        Integer boxedInt1;
        boxedInt1 = new Integer(a);      //обычное создание через конструктор
        Integer boxedInt2;
        boxedInt2 = Integer.valueOf(a);  //через метод .valueOf
        Integer boxedInt3;
        boxedInt3 = a;                     //автоматическая упаковка

        byte b = 126;
        Byte boxedByte1;
        boxedByte1 = new Byte(b);      //обычное создание через конструктор
        Byte boxedByte2;
        boxedByte2 = Byte.valueOf(b);  //через метод .valueOf
        Byte boxedByte3;
        boxedByte3 = b;                     //автоматическая упаковка

        short c = 1001;
        Short boxedShort1;
        boxedShort1 = new Short(c);      //обычное создание через конструктор
        Short boxedShort2;
        boxedShort2 = Short.valueOf(c);  //через метод .valueOf
        Short boxedShort3;
        boxedShort3 = c;                     //автоматическая упаковка

        long d = 1234567889L;
        Long boxedLong1;
        boxedLong1 = new Long(d);      //обычное создание через конструктор
        Long boxedLong2;
        boxedLong2 = Long.valueOf(d);  //через метод .valueOf
        Long boxedLong3;
        boxedLong3 = d;                     //автоматическая упаковка

        //Упаковываем те, что с плавающей запятой
        float e = 3.14f;
        Float boxedFloat1;
        boxedFloat1 = new Float(e);      //обычное создание через конструктор
        Float boxedFloat2;
        boxedFloat2 = Float.valueOf(e);  //через метод .valueOf
        Float boxedFloat3;
        boxedFloat3 = e;                     //автоматическая упаковка

        double f = 2.71828;
        Double boxedDouble1;
        boxedDouble1 = new Double (f);      //обычное создание через конструктор
        Double  boxedDouble2;
        boxedDouble2 = Double.valueOf(f);  //через метод .valueOf
        Double boxedDouble3;
        boxedDouble3 = f;                     //автоматическая упаковка

        // упаковываем char
        char g = 'A';
        Character boxedCharacter1;
        boxedCharacter1 = new Character (g);      //обычное создание через конструктор
        Character  boxedCharacter2;
        boxedCharacter2 = Character.valueOf(g);  //через метод .valueOf
        Character boxedCharacter3;
        boxedCharacter3 = g; //автоматическая упаковка

        // Упаковываем булево значение
        boolean h = true;
        Boolean boxedBoolean1;
        boxedBoolean1 = new Boolean (h);      //обычное создание через конструктор
        Boolean  boxedBoolean2;
        boxedBoolean2 = Boolean.valueOf(h);  //через метод .valueOf
        Boolean boxedBoolean3;
        boxedBoolean3 = h; //автоматическая упаковка

        String stringValue  = "Эти данные упакованы: ";//задаем строку для красивого вывода

        System.out.println(stringValue + boxedInt1 + " " + boxedInt2 + " " + boxedInt3);
        System.out.println(stringValue + boxedByte1 + " " + boxedByte2 + " " + boxedByte3);
        System.out.println(stringValue + boxedShort1 + " " + boxedShort2 + " " + boxedShort3);
        System.out.println(stringValue + boxedLong1 + " " + boxedLong2 + " " + boxedLong3);
        System.out.println(stringValue + boxedFloat1 + " " + boxedFloat2 + " " + boxedFloat3);
        System.out.println(stringValue + boxedDouble1 + " " + boxedDouble2 + " " + boxedDouble3);
        System.out.println(stringValue + boxedCharacter1 + " " + boxedCharacter2 + " " + boxedCharacter3);
        System.out.println(stringValue + boxedBoolean1 + " " + boxedBoolean2 + " " + boxedBoolean3);

        //выполняем распаковку всех типов примитивных данных
        //целочисленные
        int unboxedInt1 = boxedInt1;
        int unboxedInt2 = boxedInt2;
        int unboxedInt3 = boxedInt3;

        byte unboxedByte1 = boxedByte1;
        byte unboxedByte2 = boxedByte2;
        byte unboxedByte3 = boxedByte3;

        short unboxedShort1 = boxedShort1;
        short unboxedShort2 = boxedShort2;
        short unboxedShort3 = boxedShort3;

        long unboxedLong1 = boxedLong1;
        long unboxedLong2 = boxedLong2;
        long unboxedLong3 = boxedLong3;

        //с плавающей запятой
        float unboxedFloat1 = boxedFloat1;
        float unboxedFloat2 = boxedFloat2;
        float unboxedFloat3 = boxedFloat3;

        double unboxedDouble1 = boxedDouble1;
        double unboxedDouble2 = boxedDouble2;
        double unboxedDouble3 = boxedDouble3;

        //char
        char unboxedChar1 = boxedCharacter1;
        char unboxedChar2 = boxedCharacter2;
        char unboxedChar3 = boxedCharacter3;

        //а тут булево
        boolean unboxedBoolean1 = boxedBoolean1;
        boolean unboxedBoolean2 = boxedBoolean2;
        boolean unboxedBoolean3 = boxedBoolean3;

        String stringValueUn  = "Эти данные распакованы: ";
        System.out.println(stringValueUn + unboxedInt1 + " " + unboxedInt2 + " " + unboxedInt3);
        System.out.println(stringValueUn + unboxedByte1 + " " + unboxedByte2 + " " + unboxedByte3);
        System.out.println(stringValueUn + unboxedShort1 + " " + unboxedShort2 + " " + unboxedShort3);
        System.out.println(stringValueUn + unboxedLong1 + " " + unboxedLong2 + " " + unboxedLong3);
        System.out.println(stringValueUn + unboxedFloat1 + " " + unboxedFloat2 + " " + unboxedFloat3);
        System.out.println(stringValueUn + unboxedDouble1 + " " + unboxedDouble2 + " " + unboxedDouble3);
        System.out.println(stringValueUn + unboxedChar1 + " " + unboxedChar2 + " " + unboxedChar3);
        System.out.println(stringValueUn + unboxedBoolean1 + " " + unboxedBoolean2 + " " + unboxedBoolean3);


    }}
