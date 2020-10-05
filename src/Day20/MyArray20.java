package Day20;

public class MyArray20 {
    public static void main(String[] args) {
        myNewTypeArrayInt();
        // копирование массива
        int[] source = new int[]{1, 2, 3};
        int[] copy = getMeArrayCopy(source); //CHTO BI MASSIVI NE IMRLI SVYAZI S massivom kotorii kopiruem
        //nujno vse skopirovat po elementno
        int min=5;
        int max=15;
        int[] arr = creatRandomArray(min,max);
        FillAndPrintArray.myPrintInArray(arr);

    }

    private static int[] creatRandomArray(int min, int max) {
        int size = (int) (Math.random() * 100);
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            int myRandomTemp= (int) ((Math.random() * (max - min) + 1) + min);
            output[i]=myRandomTemp;
        }
        return output;
    }

    private static int[] getMeArrayCopy(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }

        return output;
    }

    private static void myNewTypeArrayInt() {
        int a = 5;
        int b = 50;
        int[] myNewArray = new int[]{a, b};
        int[] anotherArray = new int[10];
        //   int[] thirdArray={1,2,3,4,5};
        int[] secondArray = myNewArray;//все ссылки элементов лблмз массивов будут ссылпться в odinakovie mesta
        // izmenenie lubogo znacheniy v odnom iz massivov menyaetsya i v drugom
        secondArray[1] = secondArray[1] + 100; //


    }
}
