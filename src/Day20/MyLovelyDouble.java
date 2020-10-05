package Day20;

public class MyLovelyDouble {
    public static void main(String[] args) {
        int min=2;
        int max=10;
        double[] myDoubleArr=creatDoubleArray(min,max);
        myPrintInArray(myDoubleArr);
    }

    private static double[] creatDoubleArray(int min,int max) {
        int size = (int) (Math.random() * 100);
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {
            double myRandomTemp=  ((Math.random() * (max - min) + 1) + min);
            output[i]=myRandomTemp;
        }
        return output;
    }
    public static void myPrintInArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // for (int j = 0; j < 5; j++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
