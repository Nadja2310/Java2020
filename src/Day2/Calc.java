package Day2;

public class Calc {
    public static void main(String[] args) {
       // intIntroduction();
        int a=4;
        int b=10;

        addition(a,b);
        multiplication(a,b);
    }

    public static void multiplication(int a,int b) {
        //int a = 5;
       // int b = 10;
        System.out.println("multiplication  " + a * b);
    }

    public static void addition(int a, int b) {
        //int a = 5;
        //int b = 10;
        System.out.println("addition  " + (a + b));
    }

    public static void intIntroduction() {
        //System.out.println(5 + 3);
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("Summa =" + c);
        int money = 900;
        int iphoneCost = 1000;
        System.out.println("Kol-vo Iphone   " + money / iphoneCost);
    }
}
