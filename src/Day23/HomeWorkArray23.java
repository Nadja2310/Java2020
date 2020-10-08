package Day23;

import Day20.FillAndPrintArray;

public class HomeWorkArray23 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{8, 6, 7, 9, 5};
        FillAndPrintArray.myPrintInArray(swapEnds(arr1));
        //→ [4, 2, 3, 1]
        FillAndPrintArray.myPrintInArray(swapEnds(arr2));
        //→ [3, 2, 1]
        FillAndPrintArray.myPrintInArray(swapEnds(arr3));
        //→ [5, 6, 7, 9, 8]
        System.out.println("****************************");

        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2};
        int[] arr6 = new int[]{2};
        int sizeArrayOutput = 2;

        FillAndPrintArray.myPrintInArray(frontPiece(arr4, sizeArrayOutput));// → [1, 2]
        FillAndPrintArray.myPrintInArray(frontPiece(arr5, sizeArrayOutput));// → [1, 2]
        FillAndPrintArray.myPrintInArray(frontPiece(arr6, sizeArrayOutput));// → [1]

        System.out.println("************************");
        int[] array1 = new int[]{1, 2, 3};
        int[] array12 = new int[]{7, 9, 8};

        int[] array2 = new int[]{1};
        int[] array22 = new int[]{2};
        int[] array3 = new int[]{1, 7};
        int[] array31 = new int[0];

        FillAndPrintArray.myPrintInArray(front11(array1, array12));// → [1, 7]
        FillAndPrintArray.myPrintInArray(front11(array2, array22));// → [1, 2]
        FillAndPrintArray.myPrintInArray(front11(array3, array31));// → [1]
    }


    //Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
    // If either array is length 0,ignore that array.
    private static int[] front11(int[] array1, int[] array2) {
        int size = 2;
        if (array1.length == 0) {
            int[] outputArr = new int[size - 1];
            outputArr[0] = array2[0];
            return outputArr;
        } else if (array2.length == 0) {
            int[] outputArr = new int[size - 1];
            outputArr[0] = array1[0];
            return outputArr;
        } else {
            int[] outputArr = new int[size];
            outputArr[0] = array1[0];
            outputArr[1] = array2[0];
            return outputArr;
        }


    }

    //Given an int array of any length, return a new array of its first 2 elements.
    // If the array is smaller than length 2, use whatever elements are present.
    private static int[] frontPiece(int[] arr, int size) {

        if (size > arr.length - 1) {

            return arr;
        } else {
            int[] outpurArr = new int[size];
            for (int i = 0; i < size; i++) {
                outpurArr[i] = arr[i];
            }
            return outpurArr;
        }

    }

    //Given an array of ints, swap the first and last elements in the array. Return the modified array.
    // The array length will be at least 1.
    //
    private static int[] swapEnds(int[] arr) {

        int size = arr.length;
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        return arr;
    }

}
