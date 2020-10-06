package Day19;

public class MyFirstArray {
    public static void main(String[] args) {
        // Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации
        //случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
        double[] output = homeWork18_01();
        System.out.println(output);//распечатывает адрес ячейки массива.
        // чтобы распечатать нужен новый метод
        myFirstDoubleArrayPrint(output);
        System.out.println("Max " + myMax(output));
        System.out.println("Min " + MyMin(output));
        System.out.println("Middel " + myMiddel(output));
        // System.out.println("ПРИВЕТ ДАНЯ");
        //System.out.println("Hallo DANIEL");
        //System.out.println("Hallo Kirill");

    }

    private static double myMiddel(double[] myArray) {
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];
        }
        System.out.println("Sum = " + sum);
        //sum=myArray[0]+myArray[myArray.length-1]*myArray.length/2;
        return sum / (myArray.length);
    }

    private static double MyMin(double[] myArray) {
        double minNum = myArray[0];
        for (int i = 1; i < myArray.length; i++) {

            minNum = Math.min(minNum, myArray[i]);
            //или (min<myArray?min:myArray[i]);
        }
        return minNum;
    }

    private static double myMax(double[] myArray) {
        double maxNum = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            /*if (maxNum>=myArray[i]){
                maxNum=myArray[i];
            }*/
            maxNum = Math.max(maxNum, myArray[i]);
        }
        return maxNum;
    }

    private static void myFirstDoubleArrayPrint(double[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }

    private static double[] homeWork18_01() {
        double[] output;
        output = new double[10];
        output[1] = 25.85;
        for (int i = 0; i < output.length; i++) {
            output[i] = Math.random();

        }
        return output;
    }
}
