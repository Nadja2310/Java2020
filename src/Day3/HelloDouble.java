package Day3;

public class HelloDouble {
    public static void main(String[] args) {
        double a, b, c, d;
        a = 5.0;
        b = 3.0;
        c = 7.0;
        d = a / c;
        System.out.println("Double "+d);
        int var1=3;
        int var2=5;
        double var3=var1/var2;// будет 0 так как делятся целые и берется ноль преобразуется в 0.0
        System.out.println(var3);

    }
}
