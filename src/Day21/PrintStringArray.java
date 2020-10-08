package Day21;

import java.util.Scanner;

public class PrintStringArray {
    public static void main(String[] args) {
        String[] germanCites = myScannerArray();
        myPrintInArrayString(germanCites);
    }

    private static String[] myScannerArray() {

        Scanner input = new Scanner(System.in);
        int size;
        String s;
        System.out.println("\u001B[44m"+"Array size?"+"\u001B[0m");

        size = input.nextInt();
        String[] outpurArr = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\u001B[33m"+"Enter the array element(string)");
            s = input.next();
            outpurArr[i] = s;
        }
        System.out.println("\u001B[0m");
        input.close();
        return outpurArr;
    }


    public static void myPrintInArrayString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
