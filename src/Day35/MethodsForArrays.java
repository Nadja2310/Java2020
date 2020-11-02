package Day35;

public class MethodsForArrays {
    public static void main(String[] args) {
        int size = 5;
        byte[] array = new byte[size];
        createArray(array);
        printArray(array);

        int[] arrInt = new int[size];
        createArray(arrInt);
        printArray(arrInt);
        printArray(addElementArray(arrInt, 23));
        updateElementArray(arrInt, 2, 11);
        printArray(arrInt);
        printArray(deleteElementArray(arrInt, 2));

        char[] arrChar = new char[size];
        createArray(arrChar);
        printArray(arrChar);
        printArray(addElementArray(arrChar,'$'));
        updateElementArray(arrChar, 2,'a');
        printArray(arrChar);
        printArray(deleteElementArray(arrChar, 2));
    }

    //create
    public static void createArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }

    public static void createArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 10;
        }
    }

    public static void createArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (Math.random() * 100);
        }
    }

    public static void createArray(byte[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (Math.random() * 100);
        }
    }

    //print
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(byte[] arr) {
        for (byte element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //add element
    public static int[] addElementArray(int[] arr, int newElement) {
        int size = arr.length + 1;
        int[] output = new int[size];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[arr.length] = newElement;
        return output;
    }


    public static double[] addElementArray(double[] arr, double newElement) {
        int size = arr.length + 1;
        double[] output = new double[size];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[arr.length] = newElement;
        return output;
    }

    public static byte[] addElementArray(byte[] arr, byte newElement) {
        int size = arr.length + 1;
        byte[] output = new byte[size];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[arr.length] = newElement;
        return output;
    }

    public static char[] addElementArray(char[] arr, char newElement) {
        int size = arr.length + 1;
        char[] output = new char[size];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }
        output[arr.length] = newElement;
        return output;
    }

    //update element
    public static void updateElementArray(int[] arr, int index, int valueInt) {
        arr[index] = valueInt;
    }

    public static void updateElementArray(double[] arr, int index, double valueDouble) {
        arr[index] = valueDouble;
    }

    public static void updateElementArray(char[] arr, int index, char valueChar) {
        arr[index] = valueChar;
    }

    //delete
    public static int[] deleteElementArray(int[] arr, int index) {
        int size = arr.length - 1;
        int[] output = new int[size];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i < size; i++) {
            output[i] = arr[i + 1];
        }
        return output;
    }

    public static double[] deleteElementArray(double[] arr, int index) {
        int size = arr.length - 1;
        double[] output = new double[size];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i < size; i++) {
            output[i] = arr[i + 1];
        }
        return output;
    }

    public static byte[] deleteElementArray(byte[] arr, int index) {
        int size = arr.length - 1;
        byte[] output = new byte[size];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i <size ; i++) {
            output[i] = arr[i+1];
        }
        return output;
    }

    public static char[] deleteElementArray(char[] arr, int index) {
        int size = arr.length - 1;
        char[] output = new char[size];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = index; i <size ; i++) {
            output[i] = arr[i+1];
        }
        return output;
    }
}
