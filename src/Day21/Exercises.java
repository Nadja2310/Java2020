package Day21;

import Day20.FillAndPrintArray;

public class Exercises {
    public static void main(String[] args) {
        //
        int a=10;
        int b=100;
        int[] arr =getEvenArray(a,b);

        FillAndPrintArray.myPrintInArray(arr);
        getArrayPrime(a,b);
    }

    private static void getArrayPrime(int a, int b) {
        // Напишите программу, которая находит простые числа между a и b.
        int size=0;
            System.out.println("prime numbers " + a + " and " + b);
            for (int i = a; i <= b; i++) {
                int label = 0;
                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {
                        label += 1;//label ++;
                    }
                }
                //System.out.println(label);
                if (label == 2) size++;
            }

    }

    private static int[] getEvenArray(int a, int b) {
       // int size=((b-a)%2==0)?(b-a)/2:(b-a)/2+1;
      //  int size=(b-a)/2+1;
        int size=0;
        for (int i = a; i <=b ; i++) {
            if (i % 2 == 0) {
                size++;
            }
        }
        int count=0;
        int[] input = new int[size];
        for (int i = a; i <=b ; i++) {
          if (i % 2 == 0) {
              input[count]=i;
              count++;
          }
        }
        System.out.println(size);
        return input;
    }
}
