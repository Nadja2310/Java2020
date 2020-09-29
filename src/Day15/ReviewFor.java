package Day15;

import java.util.SplittableRandom;

public class ReviewFor {
    public static void main(String[] args) {
        checkLetterInWord("василий");
        //printSumInRub(1, 25);
        checkPalindrom( "А роза упала на лапу Азора");
        System.out.println(checkPalindrom("поп"));
        System.out.println(checkPalindrom("школа"));

    }

//15. Палиндром
//Написать свой метод проверки строки на палиндром.
//Учесть, что палиндром может быть предложением с пробелами.
//При решении задачи используйте цикл.

    private static boolean checkPalindrom(String str) {
        String input = "";
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
            }

        }
        String strRevers = "";
        input = input.toLowerCase();
        // System.out.println("inp"+input);
        for (int i = input.length() - 1; i >= 0; i--) {
            strRevers += input.charAt(i);
        }
       //    System.out.println(strRevers);
        for (int i = 0; i < input.length(); i++) {
            if (strRevers.charAt(i) != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));

        }
    }

    private static String rightWordInRussian(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (lastDigit == 1) {
            output = "рубль";
        } else if (lastDigit >= 5 || lastDigit == 0) {
            output = "рублей";
        } else output = "рубля";

        return output;
    }

    private static boolean checkLetterInWord(String str) {
        if (str.toLowerCase().contains("я")) {
            return true;
        }
        return false;
    }
}
