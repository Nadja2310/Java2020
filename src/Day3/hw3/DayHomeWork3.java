package Day3.hw3;
public class DayHomeWork3 {
    public static void main(String[] args) {
        //     Найти длину окружности
        circumference(3.6);
        //Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
        //euroToDollar(36.76, 1.1);
        currencyConverter(36.76, 1.1);

        //Найти соотношение площади Беларуси к площади Украины.
        coutrySquare(207.595, 603.628);
        //      Найти, во сколько раз площадь Москвы больше площади Берлина.
        moscowToBerlin(2511.13, 891.02);

    }

    //      Найти, во сколько раз площадь Москвы больше площади Берлина.
    private static void moscowToBerlin(double squareM, double squareB) {
        double r = squareM / squareB;
        r = r * 100;
        int r1 = (int) Math.round(r);
        double r2 = (double) r1 / 100;
        //double r1=r.setScale(2, RoundingMode.HALF_UP)
        // я прочитала про округление чисел. Последний пример округление до плавающего числа не работает

        System.out.println("площадь Москвы больше площади Берлина в " + r2 + " раза");
    }
    //Найти соотношение площади Беларуси к площади Украины.

    private static void coutrySquare(double squareB, double squareU) {
        double r = squareU / squareB;
        int r1 = (int) Math.round(r);

        System.out.println("Cоотношение площади Беларуси к площади Украины 1 к " + (int) r1);
    }


    //Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
    //название изменила на правильное по анг
    private static void currencyConverter(double dollar, double convert) {
        double sEuro = dollar * convert;
        System.out.println("EURO =" + sEuro);

    }

    //*******     Найти длину окружности. 2pi*R
    private static void circumference(double radius) {
        final double pi = 3.14;
        double circumference = 2 * pi * radius;
        System.out.println("Длина окружности = " + circumference);

    }

}

