package Day4;

public class Calc {
    public static void main(String[] args) {
        addition1();
        int a=100;
        int b=200;

        addition2(a,b);
        int ergebniss=addition3(a,b);
    }

    private static int addition3(int a, int b) {
        int c=a+b;
        return c;

    }

    private static void addition2(int a, int b) {
        int result=a+b;
        System.out.println("результат работы метода"+ result);
    }

    private static void addition1() {
        int a=5;
        int b=7;
        int c=a+b;
        System.out.println("c= "+c);
    }
}
