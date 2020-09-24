package Day8;

public class HomeWork8 {
    public static void main(String[] args) {
        int inputAge;
        inputAge = 10;
        System.out.println("Покупателю " + inputAge + " лет -" + operationsCashier(inputAge));
        inputAge = 20;
        System.out.println("Покупателю " + inputAge + " лет -" + operationsCashier(inputAge));
        inputAge = 35;
        System.out.println("Покупателю " + inputAge + " лет -" + operationsCashier(inputAge));

        int inputMonth;
        inputMonth = 7;
        System.out.println("Month " + inputMonth + "-" + myCalendarInt(inputMonth));
    }

    private static String sellArticl(int i) {
        switch (i) {
            case 0:
                return "НЕ ПРОДОВАТЬ";
            case 1:
                return "ПРОДОВАТЬ";
            default:
                return "На ваше усмотрение!";
        }
    }

    //Напишите программу действий кассира магазина, если у него пытаются купить алкоголь следующие 5 покупателей:
    //10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
    private static String operationsCashier(int inputAge) {
        switch (inputAge) {
            case 10:
            case 17:
                return sellArticl(0);
            case 18:
            case 20:
            case 30:
                return sellArticl(1);
            default:
                return "Что делать не известно.";

        }
    }

    //Напишите программу, которая определяет сезон года. Месяца указаны int переменными.
    private static String myCalendarInt(int inputMonth) {
        switch (inputMonth) {
            case 1:
            case 2:
            case 12:
                return "Winter";

            case 3:
            case 4:
            case 5:
                return "Frühling";

            case 6:
            case 7:
            case 8:
                return "Sommer";

            case 9:
            case 10:
            case 11:
                return "Herbst";


            default:
                return "no such month!!!";

        }
    }
}
