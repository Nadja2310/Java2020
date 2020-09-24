package Day7.hw_from_day6;

public class HelloBoolean {
    public static void main(String[] args) {

        //introductionBoolean();
        //introductionBoolean2();
        introductionBoolean3();

    }

    private static void introductionBoolean3() {
        boolean a=(7+8)*5>7+8*5;
        System.out.println(a);
        boolean b=(7+8)*4!=7+4*5;
        System.out.println(b);
        boolean c=3+4>9+1&16-5>3*4;
        System.out.println(c);
        boolean d=16/2<6+2|4+5<=4*5;
        System.out.println(d);
        boolean e=!(3*4<7+8);
        System.out.println(e);
    }

    private static void introductionBoolean2() {
        boolean a = true;
        boolean b, c;
        b = false;
        c = a & b;
        System.out.println("a & b:"+c);
        c = a | b;
        System.out.println("a | b:"+c);
        c = a ^ b;
        System.out.println("a ^ b:"+c);
        c = a != b;
        System.out.println("a != b:"+c);
    }
    private static void introductionBoolean() {
        int a = 1;
        int b = 2;
        System.out.println(a > b);
        System.out.println(a < b);
        //& und
        //| oder
        //
        System.out.println(a != b);
        System.out.println(a == b);
    }
}

