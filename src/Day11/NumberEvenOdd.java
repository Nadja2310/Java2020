package Day11;

public class NumberEvenOdd {
    public static void main(String[] args) {
        int intinputNumber = 376;
        chekNumberEvenOdd(intinputNumber);
        chekNumberEvenOdd(768);
    }


    //11. Чёт/нечет разрядов
//Дано целое трехзначное число. Написать метод, который определит чётность/ нечётность разрядов этого числа, например:
//123 -> 1 – нечет. 2- чёт. 3-нечет. 768 -> 1 – нечет. 2- чёт. 3-чет.
    private static void chekNumberEvenOdd(int intinputNumber) {
        String str = String.valueOf(intinputNumber); //можно через строку
        System.out.println("Input number = "+str);
        int number = intinputNumber;
        int dlinaNumber=(int) str.length();
        for (int i = 0; i < dlinaNumber; i++) {
            number = intinputNumber % 10;//проверим остаток на чет-нечет
            System.out.println(inputOddEven(number));
            intinputNumber = intinputNumber / 10;

        }

    }

    private static String inputOddEven(int a) {
        if (a % 2 == 0) {
            return "четное " + a;
        } else {
            return "нечетное " + a;
        }
    }
}
