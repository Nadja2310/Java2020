package Day20;

public class FillAndPrintArray {
    public static void main(String[] args) {
        int[] source=new int[]{1,2,3,4,5};
        int myFillElement=100;
        fillArray(source,myFillElement);
        myPrintInArray(source);

    }

    public static void myPrintInArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println("]");
    }

    public static void fillArray(int[] arr, int myFillElement) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=myFillElement;
        }
    }
}
