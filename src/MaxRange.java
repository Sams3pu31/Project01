public class MaxRange {
    public static void main(String[] args){
//        чтобы код выполнялся (выводились ошибки), нужно предидущие типы данных закомментировать
//        byte a = 130;
//        byte b = -130;
//        System.out.println(a);
//        System.out.println(b);
        // Так как используется тип данных "byte",
        // имеющий диапазон значений (-128 до 127), я же задаю число, за границей диапазона.
        // код не может быть скомпелирован, выдаст ошибку:
        // "java: incompatible types: possible lossy conversion from int to byte"
//        short c = 33000;
//        short d = 33000;
//        System.out.println(c);
//        System.out.println(d);
        // Так как используется тип данных "short",
        // имеющий диапазон значений ( -32,768 до 32,767), я же задаю число, за границей диапазона.
        // код не может быть скомпелирован, выдаст ошибку:
        // "java: incompatible types: possible lossy conversion from int to short"
//        float e = 3.4E+39F;
//        float f = 3.4E+39F;
//        System.out.println(e);
//        System.out.println(f);
        // Так как используется тип данных "float",
        // имеющий диапазон значений ( -3.4E+38 до 3.3E+38), я же задаю число, за границей диапазона.
        // код не может быть скомпелирован, выдаст ошибку:
        // "java: floating-point number too large"
    }}
