package Day3;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Random {
    public static void main(String[] args) {
        double myRandom=Math.random();// ot 0 do 1
        double newResult= myRandom*100;
        System.out.println(newResult);
        int result=(int) newResult;
        System.out.println("perebor celix chisel "+result);
        int min=30;
        int max=100;
        int myDigit= (int) (Math.random()*(max-min)+1)+min;
        System.out.println("V "+myDigit);

    }
}
