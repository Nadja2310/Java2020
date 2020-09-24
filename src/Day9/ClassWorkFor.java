package Day9;

public class ClassWorkFor {
    public static void main(String[] args) {
        int lines = 10;
        // triangle(lines);
        // simpleString();
        int a, b;
        a = 2;
        b = 4;
        System.out.println("Sum a und b = " + sum(a, b));
        modulaThree();
        myLine(100);
        //printBukva();
paris(10,5);
    }

    private static boolean paris(int a,int b) {
        if (a+b<=25){
            return true;
        }
          else return false; // по другому Java предлагает сразу все строчки заменить на return
    }




    //myLine(100) ->
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98
    private static void myLine(int zahl) {

        for (int i = 7; i < zahl; i += 7) {
            System.out.print(i + " ");
        }
    }


    //2. На 3 без остатка
    //Вывести на экран все числа от 1 до 100, которые делятся на 3 без остатка.
    private static void modulaThree() {
        int sum3 = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum3 = sum3 + i;
            }

        }
        System.out.println("Summa s 3 = " + sum3);
    }


    private static int sum(int a, int b) {
        int totalS = 0;
        for (int i = a; i <= b; i++) {
            totalS = totalS + i;
        }
        return totalS;
    }
//4. Дано два числа (a и b). Написать метод, который вернет сумму всех чисел между (a и b).
// Если a равно b, метод
//должен вернут a+b
//Пример: sum(2,4) -> 9

    private static void triangle(int number) {
        String start = "*";

        for (int i = 0; i < number; i++) {
            System.out.println(start);
            start += "*";


        }
    }
}
