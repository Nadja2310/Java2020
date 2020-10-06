package Day21;

import Day20.FillAndPrintArray;

public class ExercisesAddElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 69};
        int key = 4; //key, value
        int value = 100;
        FillAndPrintArray.myPrintInArray(addElement(arr, key, value));
    }

    private static int[] addElement(int[] arr, int index, int value) {
        int[] res=new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            res[i]=arr[i];

        }
        res[index]=value;
        for (int i = index+1; i < res.length; i++) {
            res[i]=arr[i-1];

        }
        return res;
    }
}
