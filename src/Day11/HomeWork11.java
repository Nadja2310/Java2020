package Day11;

public class HomeWork11 {
    public static void main(String[] args) {

        System.out.println("Задание 12");
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));//→ 21

        System.out.println("Задание 13");
        System.out.println(in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
        System.out.println(in1To10(7, true));// → true

        System.out.println("Задание 14");
        System.out.println(old35(3));// →true
        System.out.println(old35(10));// →true
        System.out.println(old35(15));// →false
        System.out.println(old35(16));// →false
    }


    //Given 2 ints, a and b, return their sum.
    // However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
    private static int sortaSum(int a, int b) {

        if (a + b <= 19 && a + b >= 10) {
            return 20;
        }
        else return a + b;
    }

    //Given a number n, return true if n is in the range 1..10, inclusive. Unless outsideMode is true,
    // in which case return true if the number is less or equal to 1, or greater or equal to 10.
    //как я поняла задание. Если n в диапозоне от 1 до 10 возвращать истина./....
    // Если outsideMode истина то возвращать тоже истина. Во всех остальных лож.
    private static boolean in1To10(int n, boolean outsideMode) {
   /*     if (n >= 1 && n <= 10 && outsideMode){
            return true;
        }*/
        return outsideMode || (n >= 1 && n <= 10);
    }

    //Return true if the given non-negative number is a multiple of 3 or 5,
    // but not both. Use the % "mod" operator -- see Introduction to Mod
    private static boolean old35(int a) {
        // return number%5== ^ number%3 ==0; короткий вариант
        if (a %3==0 && a%5==0) {
            return false;
        }
       else {
           return  (a %3==0 || a%5==0);
        }
    }
}
