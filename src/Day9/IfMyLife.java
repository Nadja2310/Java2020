package Day9;

public class IfMyLife {
    public static void main(String[] args) {
        loop();

        forIntroductionOne();
        forIntroductionTwo();


    }

    private static void forIntroductionTwo() {
        int a = 0;
        for (int i = 0; i < 10; i+=2) {//i=i+2 oder i+=2
            a++;
            System.out.println("Steep "+i);
        }
    }

    private static void forIntroductionOne() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        System.out.println(a);
    }

    private static void loop() {
        int workWeekDays = 5;
        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("------------------День " + i);

            System.out.println("Новый день");
            System.out.println("встаю в 6 утра");
            System.out.println("На завод в 8 утра");
            System.out.println("Дома снова 18");
            System.out.println("Смотрю телевизор");
            System.out.println("Ложусь спать в 21");
        }
    }
}
