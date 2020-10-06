package Day21;

import Day20.FillAndPrintArray;

public class ExercisesRevers {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3,4,5,6};
        int[] arr2=new int[]{4,5,12,67,8,23};

        FillAndPrintArray.myPrintInArray(arrayReverse(arr1));
        FillAndPrintArray.myPrintInArray(arrayReverse(arr2));

    }

    private static int[] arrayReverse(int[] input) {
        int[] output=new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[input.length-1-i]=input[i];
        }
        return output;
    }
}
