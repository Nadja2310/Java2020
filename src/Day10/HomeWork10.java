package Day10;

public class HomeWork10 {
    public static void main(String[] args) {
        split();
        //если 1 то выводит четные иначе нечетные
        inputOddEven(2, 10, 1);
        split();
        inputOddEven(2, 10, 0);
        split();
        //проверка кратности 11
        inputMultiple(12, 56, 11);
        //проверка кратности 4
        split();
        inputMultiple(20, 47, 4);
        //***
        split();
        primenumbers(30, 80);
        split();
        System.out.println(division3000(3000));
        split();
        leapYear(1999, 2101);
    }


    // Напишите программу, которая находит простые числа между a и b.
    private static void primenumbers(int a, int b) {
        System.out.println("prime numbers " + a + " and " + b);
        for (int i = a; i <= b; i++) {
            int label = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    label += 1;//label ++;
                }
            }
            //System.out.println(label);
            if (label == 2) System.out.print(" " + i);
        }
    }

    // Дано число меньше 3000. При делении числа на 32 получается остаток 30,
    // при делении на 58 - остаток 44. Найдите число или числа.
    private static String division3000(int myNumber) {
        System.out.println("При делении на 32 получается остаток 30 и на 58 остаток 44");
        String str="";
        for (int i = 1; i < myNumber; i++) {
            if (i % 32 == 30 && i % 58 == 44) str+=" " + i;
        }
        return str;
    }

    // Напишите программу, которая находит числа кратные 11 между a и b.
    private static void inputMultiple(int a, int b, int label) {
        for (int i = a; i <= b; i++) {
            if (i % label == 0) System.out.print(i + " ");
        }
    }

    //
    // Прочитайте в Википедии, какие года являются високосными и дополните предыдущую задачу.
    private static void leapYear(int a, int b) {

        for (int i = a; i <= b; i++) {
            int label = 0;
            if (i % 4 == 0) {
                label=1;
               //System.out.println("popal" + i);

                if (i % 400 != 0 && i % 100 == 0) label=0;
                //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
                // Годы 1600 и 2000 — високосные, так как они кратны 400.
                // Годы 2100, 2200 и 2300 — невисокосные.
            }
            if (label==1)   System.out.println("leap year " + i + "  ");
        }
    }


    private static void split() {
        System.out.println("\n" + "************************");
    }

    //Напишите программу, которая находит чётные числа между a и b.
//Напишите программу, которая находит нечётные числа между a и b.
    ////если label 1 то выводит четные иначе нечетные
    private static void inputOddEven(int a, int b, int label) {
        for (int i = a; i <= b; i++) {
            if (label == 1) {
                if (i % 2 == 0) System.out.print(i + " ");

            } else if (label == 0) {
                if (i % 2 != 0) System.out.print(i + " ");
            }
        }
    }
}
