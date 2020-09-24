package Day10;

public class ClassWork10 {
    public static void main(String[] args) {
        multiplicationTable(3);
        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false));// → true
        System.out.println(cigarParty(70, true));// → true

        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0

        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true

    }
//4. Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
// See also: Introduction to Mod
    private static boolean more20(int number) {
     return (number%20==1) || (number%20==2);
    }

    // Ты едешь слишком быстро, и полицейский останавливает тебя. Напишите код для вычисления результата,
// закодированный в виде значения int:
//0=нет билета, 1=маленький билет, 2=большой билет. Если скорость 60 или меньше, то результат равен 0.
// Если скорость между 61 и 80 включительно, то в качестве значения
//результат 1. если скорость 81 и более, то результат 2. если только не день рождения -
// в этот день скорость может быть на 5 выше.
//ящики.
    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {

            speed -= 5;
        }
        if (speed <= 60) return 0;
        else if (speed <= 80) {
            return 1;
        } else return 2;
    }


    //1. When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is
//between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
//
// Когда белки собираются на вечеринку, они любят сигары. Вечеринка с белкой проходит успешно, когда количество сигар -
//// между 40 и 60, включительно. Если только это не выходные, то в этом случае нет верхней границы по количеству сигар.
////Возврат к истинному значению, если партия с заданными значениями успешна, или фальшива в противном случае.Return true if the party with the given values is successful, or false otherwise.
    private static boolean cigarParty(int numberOfCigarts, boolean weekend) {
        if (numberOfCigarts >= 40 && numberOfCigarts <= 60) {
            return true;
        } else if (weekend && numberOfCigarts >= 40) {
            return true;
        } else return false;

    }

    //
    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + i * number);
        }
    }
}
