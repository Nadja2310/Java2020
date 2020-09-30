package Day17;

public class TernariusUndWhileHW17 {
    public static void main(String[] args) {
        //Даны два числа, a и b. Верните большее из них. Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));// → 16
        System.out.println(getMeMax(20, 100));// → 100
        //Даны два числа, a и b. Верните меньшее из них. Не используйте никаких методов из библиотеки Math. Покажите работу тернарного оператора.
        System.out.println(getMeMin(15, 45));// → 15
        System.out.println(getMeMin(44, 16));// → 16
        System.out.println(getMeMin(200, 100));// → 100
        //Даны два строковых значения. Верните идущее по алфавиту раньше.
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"

        //While, Do While
        //Даны целые числа A и B, где B > 0. Вывести B раз число A.
        printAB(6, 5);
        System.out.println();
        System.out.println("Вывести в порядке возрастания все числа между А и B");
        //Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
        printAB2(5, 17);
    }

    private static void printAB2(int a, int b) {

        int i = a;
        do {
            System.out.printf("%3d", i);
            i++;
        } while (i <= b);

    }

    private static void printAB(int a, int b) {
        int i = 0;
        while (i < b) {
            System.out.printf("%3d", a);
            i++;
        }
    }

    private static String myFirstCompareTo(String str1, String str2) {
        return ((str1.charAt(0) < str2.charAt(0)) ? str1 : str2);
    }

    private static int getMeMin(int a, int b) {
        return (a > b ? b : a);
    }

    private static int getMeMax(int a, int b) {
        return (a > b ? a : b);
    }
}
