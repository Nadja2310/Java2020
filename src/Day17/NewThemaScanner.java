package Day17;

import java.util.Scanner;

public class NewThemaScanner {
    public static void main(String[] args) {
       // myScanner();
        myPresident();
    }

    private static void myPresident() {
        int vote1;
        Scanner input=new Scanner(System.in);
        System.out.println("Введите поцент голосов отданных за кандидата 1");
        vote1=input.nextInt();
        System.out.println("Введите поцент голосов отданных за кандидата 2");
   int vote2=input.nextInt();
   if (vote1>vote2 && vote1>50){
       System.out.println("Победил кадидат 1");
   }else if (vote2>vote1 && vote2>50){
       System.out.println("Победил кадидат 2");
   }else System.out.println("Президент не определен");

        input.close();
    }


    private static void myScanner() {
        Scanner input=new Scanner(System.in);
        int x;
        String s;
        System.out.println("VVedite cifry");
        x=input.nextInt();
        System.out.println("Vvedite stroky");
        s=input.next();
        System.out.println("Vi vveli");
        System.out.println(x);
        System.out.println(s);
        input.close();
    }
}
