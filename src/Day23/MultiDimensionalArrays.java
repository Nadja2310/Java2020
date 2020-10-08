package Day23;

public class MultiDimensionalArrays {


    public static void main(String[] args) {

        magicMonth();
        printTwoDStringArray(simpelTable());
    }

    private static void printTwoDStringArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    private static String[][] simpelTable() {
        String[][] myArray = new String[5][3];
        myArray[0][0] = "1";
        myArray[0][1] = "Ivanov";
        myArray[0][2] = "№23456685";

        myArray[1][0] = "2";
        myArray[1][1] = "Petrov";
        myArray[1][2] = "№23456685";

        myArray[2][0] = "3";
        myArray[2][1] = "Iranov";
        myArray[2][2] = "№23456685";

        myArray[3][0] = "4";
        myArray[3][1] = "Sidorov";
        myArray[3][2] = "№23456685";

        myArray[4][0] = "5";
        myArray[4][1] = "Vasin";
        myArray[4][2] = "№23456685";
        return myArray;
    }

    private static void magicMonth() {
        int[][] monthCalendar;
        monthCalendar = new int[4][7];
        for (int i = 0; i < monthCalendar.length; i++) {
            for (int j = 0; j < monthCalendar[i].length; j++) {
                monthCalendar[i][j] = i * 7 + j + 1;
                System.out.print(monthCalendar[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
