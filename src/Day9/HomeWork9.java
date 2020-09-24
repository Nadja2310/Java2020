package Day9;

public class HomeWork9 {
    public static void main(String[] args) {
        printBukva();
        split();
        System.out.println("Сравнение 2 чисел " + moreOrLess(5, 6));// -> 6
        System.out.println("Сравнение 2 чисел " + moreOrLess(5, 5));// -> 0
        System.out.println("Сравнение 2 чисел " + moreOrLess(0, 100));// -> 100
        split();
        System.out.println("Summa a+b+c= " + mySum(5, 6, 5)); //-> 6
        System.out.println("Summa a+b+c= " + mySum(5, 6, 7)); //-> 18
        System.out.println("Summa a+b+c= " + mySum(0, 0, 0)); //-> 0
        System.out.println("Summa a+b+c= " + mySum(0, -5, 5));// -> -1
        split();
        ryadFibanachi();
        split();

        System.out.println(sleepIn(false, false));// → true
        System.out.println(sleepIn(true, false));// → false
        System.out.println(sleepIn(false, true));// → true

    }


    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is
//not a weekday or we're on vacation. Return true if we sleep in.
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
    private static boolean sleepIn(boolean myWeekday, boolean myVacation1) {
      /*  if ((!myWeekday & myVacation1) || (!myWeekday & !myVacation1)) {
            return "Sleep/ True";
        } else {
            return "go work/ false";
        }*/
        //или
       return !myWeekday||myVacation1;
    }

    //Ряд Фибоначчи
//Выведите на экран первые 11 членов последовательности Фибоначчи.
//первый и второй члены последовательности равны единицам
//а каждый следующий — сумме двух предыдущих
//То есть числа Фибоначчи - это 1 1 2 3 5 8 13 21 34 55 89 и т.д.
    private static void ryadFibanachi() {
        int res1 = 0;
        int res2 = 1;
        int res3 = 1;
        for (int i = 0; i < 11; i++) {
            System.out.print(res3 + " ");
            res3 = res1 + res2;
            res1 = res2;
            res2 = res3;
        }
    }

    //Даны три целых числа, верните их сумму. Если первое и третье числа равны друг другу, то верните второе, если
//сумма равна нулю, то верните -1.
    private static int mySum(int a, int b, int c) {
        if (a == c) {
            return b;
        } else if (a + b + c == 0) {
            return -1;
        } else return a + b + c;
    }

    //Даны два целых числа, верните большее из двух. Если числа равны, то верните ноль.
    private static int moreOrLess(int a, int b) {
        if (a > b) {// math.max(a,b)
            return a;
        } else if (b > a) {
            return b;
        } else return 0;

    }


    //5. 4 Буквы в строке
//Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
    private static void printBukva() {
      /*  String alfabet = "ABCDFGHJKLMNPQRSTVWXYZ";
        int j = 0;
        int dlinaString = alfabet.length();
        for (int i = 0; i < dlinaString; i += 1) {

            System.out.print(alfabet.substring(i, i + 1));
            j += 1;
            if (j == 4) {
                System.out.println("");
                j = 0;
            }
        }*/
        String result="";
        for (char c='A';c<='Z';c++)
        {
            result=result+"/n"+c;
            System.out.println(""+c);
        }
       // return result;
        /*for (int i=65;i<=90;i++)      {
            char temp= (char) i;
            System.out.println(""+temp+temp+temp+temp);
        }*/
    }



    public static void split() {
        System.out.println("***********************");
    }
}