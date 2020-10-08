package Day22;

public class MyLovelyFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(7));
        System.out.println(getFactorial(5));
        System.out.println(getFactorialRecursion(5));
        System.out.println(getFactorialRecursion(7));

    }

    private static int getFactorialRecursion(int number) {
        //!100=!99*100
        //!6=!5*6
        //рекурсия
        if (number<1){//это условия завершения пермножения как только
            // получаем единицу занчит пермножение чисел закончилось
            //5*4*3*2*1
            return 1;
        } else {
            return number*getFactorialRecursion(number-1);
        }

    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
