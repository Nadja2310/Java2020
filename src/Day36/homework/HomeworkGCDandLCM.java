package Day36.homework;

import java.util.Scanner;

public class HomeworkGCDandLCM {

    public static void main(String[] args) {
        int number1=inputNumber();
        int number2=inputNumber();
        System.out.println(searchGreatestCommonDivisor(number1,number2));
        searchLeastCommonMultiple(number1,number2);
    }

    private static int searchGreatestCommonDivisor(int num1, int num2) {
        int outputNum1=num1;
        int outputNum2=num2;
        while (outputNum1!=0 && outputNum2!=0){
            if (outputNum1>outputNum2){
                outputNum1=outputNum1%outputNum2;
            }else outputNum2=outputNum2%outputNum1;
        }
        System.out.println("НОД ЧИСЕЛ "+num1+" и "+num2+" будет "+(outputNum1+outputNum2));
        return (outputNum1+outputNum2);
    }
    private static void searchLeastCommonMultiple(int num1,int num2){

        int rez=num1*num2/searchGreatestCommonDivisor(num1,num2);
        System.out.println("НОK ЧИСЕЛ "+num1+" и "+num2+" будет "+rez);

    }

    private static int inputNumber() {
        Scanner input=new Scanner(System.in);
        System.out.println("Введите число до 100");
        int x = input.nextInt();
        //input.close();
        return x;
    }
}
