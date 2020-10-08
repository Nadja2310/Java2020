package Day22;

public class ClassWorkFactorial {
    public static void main(String[] args) {

        System.out.println(bunnyEars2(0));// → 0
        System.out.println(bunnyEars2(1));// → 2
        System.out.println(bunnyEars2(2));// → 5
        System.out.println(bunnyEars2(10));// → 25
        System.out.println(bunnyEars2(11));// → 27
        //***************+
        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0

    }
// Дано положительное целочисленное N. Верните количество семёрок в числе. 717 - вернёт 2. Обратите
//внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6), а деление на 10 удалит правую цифру(126 / 10
//равно 12). Авторы задачи были к нам слишком добры и практически решили её прямов условии.
    private static int count7(int number) {
        if (number==0){
            return 0;
        }
        else if (number%10==7) {
            return 1+count7(number/10);
        }else return count7(number/10);
    }

    //У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов.
    // У нечётных кроликов по два уха. А у чётных кроликов вроде как по три уха.
    // Это из-за того, что они все подняли ногу. Посчитайте
    //количество видимых нами "ушей". Не использовать циклы или умножение.
    private static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        } else if (rabbit == 1) return 2;
        else if (rabbit == 2) {
            return 5;
        } else {
            return 5 + bunnyEars2(rabbit - 2);
        }
    }

}
