package Day23;

import Day20.FillAndPrintArray;

public class ClassWork23 {
    public static void main(String[] args) {
        //4.
        System.out.println("18 file 4");
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{4, 5, 6};
        int[] array3 = new int[]{7, 7, 7};
        int[] array4 = new int[]{3, 8, 0};
        int[] array5 = new int[]{5, 2, 9};
        int[] array6 = new int[]{1, 4, 5};
        FillAndPrintArray.myPrintInArray(middleWay(array1, array2));
        //→ [2, 5]
        FillAndPrintArray.myPrintInArray(middleWay(array3, array4)) ;
        //→ [7, 8]
        FillAndPrintArray.myPrintInArray(middleWay(array5, array6)) ;
        //→ [2, 4]
        System.out.println("18 file 5");
        int[] arr1 = new int[]{4,5};
        int[] arr2 = new int[]{4, 2};
        int[] arr3 = new int[]{3, 5};
        System.out.println(no23(arr1));// → true
        System.out.println(no23(arr2));// → false
        System.out.println(no23(arr3));// → false

        System.out.println("18 file 6");
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{2, 3, 5};
        int[] arr6 = new int[]{1, 2, 1};
        FillAndPrintArray.myPrintInArray(fix23(arr4));
        // → [1, 2, 0]
        FillAndPrintArray.myPrintInArray(fix23(arr5));
        // → [2, 0, 5]
        FillAndPrintArray.myPrintInArray(fix23(arr6));
        // → [1, 2, 1]
    }


    //6. Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the
    //changed array.
    private static int[] fix23(int[] arr) {
        int[] output = new int[3];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==2 && arr[i+1]==3) {
                arr[i+1]=0;
            }

        }
        return arr;
    }
//5. Given an int array length 2, return true if it does not contain a 2 or 3.
    private static boolean no23(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==2||arr[i]==3){
                return false;
            }
        }
        return true;
    }

    //Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2, содержащего среднее
//арифметическое элементов первоначальных массивов.
    private static int[] middleWay(int[] array1, int[] array2) {
        int[] output=new int[2];
        int element=array1.length/2;
       // System.out.println(element);
        output[0]=array1[element];
        output[1]=array2[element];
        return output;
    }

}
