package Day1;

import java.math.BigInteger;

public class HomeWork01 {
    public static void main(String[] args) {
        //площадь и периметр квадрата
        int squareSide = 15;
        square(squareSide);
        perimeter(squareSide);
        System.out.print("\n");
        //площадь и периметр прямоугольника
        int rectangleA, rectangleB;
        rectangleA = 5;
        rectangleB = 7;
        rectangle(rectangleA, rectangleB);
        perimeterRectangle(rectangleA, rectangleB);
        //площадь и периметр  куба
        System.out.print("\n");
        int cubeA;
        cubeA = 5;
        cube(cubeA);
        perimeterCube(cubeA);
        // количество зёрен
        int chessboardA = 2;
        chessboard(chessboardA);
        chessboardFor();
    }

    //********** Square
    public static void square(int a) {
        System.out.println("Площадь квадрата =" + a * a);
    }

    public static void perimeter(int a) {
        System.out.println("Периметр квадрата =" + a * 4);
    }

    //*********rectangle

    public static void rectangle(int a, int b) {
        System.out.println("Площадь прямоугольника =" + a * b);
    }

    public static void perimeterRectangle(int a, int b) {
        System.out.println("Периметр прямоугольника =" + (2 * (a + b)));
    }

    //*************CUBE
    public static void cube(int a) {
        //s=6+a^2
        System.out.println("Площадь куба =" + (6 * (a*a)));
    }

    public static void perimeterCube(int a) {
        //P=12*a
        System.out.println("Периметр куба =" + (12 * a));
    }

    // ************ Найти количество зёрен на шахматной доске
    public static void chessboard(int a) {
        //a=2;
        double Zerna;
        Zerna = Math.pow(a, 64) - 1;
        System.out.println("Kоличество зёрен на шахматной доске        =" + Zerna);
    }

    public static void chessboardFor() {
        double ZernaFor = 1;
        //int i;
        double cornField = 2.0;
        for (int i = 1; i <= 63; i++) {
            //ZernaFor = ZernaFor + Math.pow(2,i);
            ZernaFor += cornField;
            //zernaFor += 1 << i;
            cornField *= 2;
        }
        System.out.println("Kоличество зёрен на шахматной доске циклом =" + ZernaFor);
    }
}
