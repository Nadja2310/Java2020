package Day3;

public class IntToDouble {
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        System.out.println(var6);// expect 2.5

        double var7 = var1 / var2;// expect 2.5
        System.out.println("var7="+var7);
        double var25 = var1 / var4;
        System.out.println("var25="+var25);
        int var26= (int) (var1/var4);// преобрвзрывние в целое число
    }
}
