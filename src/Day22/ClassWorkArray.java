package Day22;

import Day20.FillAndPrintArray;
import Day21.ExercisesRevers;

public class ClassWorkArray {
    public static void main(String[] args) {
        System.out.println("18 file 1.Верните true, если цифра 6 является значением в первом или последнем элементе массива");
        int[] arr1 = new int[]{1, 2, 6};
        System.out.println(firstLast6(arr1));// → true
        int[] arr2 = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(arr2));
        int[] arr3 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(arr3));

        System.out.println("18 file 2");
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{7,3};
        int[] arr6 = new int[]{7, 3, 2};
        int[] arr7 = new int[]{1, 3};
        System.out.println(commonEnd(arr4, arr5));
        System.out.println(commonEnd(arr4, arr6));
        System.out.println(commonEnd(arr4, arr7));
//3.
    //    3. Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
  //      Дан массив длиной 3, верните новый массив с элементами в обратном порядке, например {1, 2, 3} становится {3, 2, 1}.
        System.out.println("18 file 3");
        int[] arr10 = new int[]{1, 2, 3};
        int[] arr11 = new int[]{5,11,9};
        int[] arr12 = new int[]{7, 0, 0};
        FillAndPrintArray.myPrintInArray(reverse3(arr10));//→ [3, 2, 1]
        FillAndPrintArray.myPrintInArray(reverse3(arr11)); //→ [9, 11, 5]
        FillAndPrintArray.myPrintInArray(reverse3(arr12));//→ [0, 0, 7]


    }

    private static int[] reverse3(int[] inputArr) {
        return ExercisesRevers.arrayReverse(inputArr);
    }

        //Получив 2 массива int[], a и b, возвращаем true, если они имеют один и тот же первый или
// последний элемент. Оба массива будут длиной больше, либо равной единице.
    private static boolean commonEnd(int[] arr1, int[] arr2) {
        return  (arr1[0]==arr2[0]||arr1[arr1.length-1]==arr2[arr2.length-1]);
    }

    //Дан массив int. Верните true, если цифра 6 является значением в первом или последнем элементе массива.
// Массив будет длиной больше, либо равной единице.
    private static boolean firstLast6(int[] inputArr) {
        return (inputArr[0] == 6) || (inputArr[inputArr.length - 1] == 6);
    }
}
