package Day14;

public class HomeWork14 {
    public static void main(String[] args) {
        int size = 8;
        System.out.println("Шахматная доска");
        Chessboard(size);
        System.out.println("Таблица умножения");
        multiplicationTable();
        System.out.println(" Геометрические фигуры");
         geometricalFigures1(5);
         geometricalFigures2(5);
         geometricalFigures3(5);
         geometricalFigures4(5);
        geometricalFigures5(5);
    }

    //*
//**
//***
//****
    private static void geometricalFigures1(int size) {
        char symbol = '*';
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol);

            }
            System.out.println();
        }
    }

    //****
    //***
    //**
    //*
    private static void geometricalFigures2(int size) {
        char symbol = '*';
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(symbol);

            }
            System.out.println();
        }
    }

    //  *
    // **
    //***

    private static void geometricalFigures3(int size) {
        char symbol = '*';
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");

            }
            int quantity = size - i + 1;
            for (int j = 1; j <= quantity; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }

    //   *
    //  ***
    // *****
    private static void geometricalFigures4(int size) {
        char symbol = '*';
        int quantity = 1;
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");

            }

            //System.out.println(quantity);
            for (int j = 1; j <= quantity; j++) {
                System.out.print(symbol);
            }
            quantity += 2;
            System.out.println();
        }
    }

    // *****
    //  ***
    //   *
    private static void geometricalFigures5(int size) {
        char symbol = '*';
        int quantity = size;
        for (int i = 1; i < size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= quantity; j++) {
                System.out.print(symbol);
            }
            quantity -= 2;
            System.out.println();
        }
    }

    //Таблица умножения Multiplication table
    private static void multiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int a = i * j;
                String str = a + "   ";
                System.out.print(str.substring(0, 3));
                //printf("%3d",i*j);

            }
            System.out.println();
        }
    }

    private static boolean inputMultiple(int a, int label) {

        return (a % label == 0);

    }

    //Шахматная доска
    private static void Chessboard(int inputSize) {

        for (int i = 0; i < inputSize; i++) {
            String str = "";
            String inputStr = "";
            if (inputMultiple(i, 2)) {
                str = "-";
            } else if (!inputMultiple(i, 2)) {
                str = "*";
            }
            for (int j = 0; j < inputSize; j++) {
                if (str == "*") {
                    str = "-";
                } else if (str == "-") str = "*";

                inputStr += str;
            }
            System.out.println(inputStr);
        }
    }


}
