package Day7.hw_from_day6;

import java.time.format.SignStyle;
import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
        System.out.printf("%S%n","Number 6");
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true

        //4. Сравните строчку вывода со своей:
        // System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
        //introductionBoolean3();
        //5. Повторение String: Найдите метод из официальной библиотеки и покажите его работу. По возможности используйте
        //printf
        System.out.println("******Методы String*******");
        String testString="За.ме.на. то.чек..";
        System.out.println(testString+"\n"+newString(testString));
        System.out.println(testString.concat("-так не пишут!!!"));
        System.out.println(newString(testString).indexOf("."));//возвращает -1
        System.out.println (testString.indexOf("."));//возвращает 2
        System.out.println("*******Test printf********");
        System.out.printf("%b%n", null);
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5>3);
        System.out.printf("%S","print");
        System.out.printf("'%7.2f'",31.14567);

    }
    private static void introductionBoolean3() {
        boolean a=(7+8)*5>7+8*5;
        System.out.println(a);
        boolean b=(7+8)*4!=7+4*5;
        System.out.println(b);
        boolean c=3+4>9+1&16-5>3*4;
        System.out.println(c);
        boolean d=16/2<6+2|4+5<=4*5;
        System.out.println(d);
        boolean e=!(3*4<7+8);
        System.out.println(e);
        byte df = (byte)(30 + 100);

        //System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);//результат вывода будет одиноковый
    }
    private static String newString(String testString) {
     return testString.replace(".","");
    }

    //The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6.
// Or if their sum or
//difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
    private static boolean love6(int a, int b) {
        //boolean c= (a + b) ==6 || a == 6 || (b == 6);
        return  (Math.abs(a) + Math.abs(b) ==6) || (a == 6) || (b == 6)||(Math.abs(a-b)==6);

    }

}
