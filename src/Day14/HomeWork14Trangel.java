package Day14;

public class HomeWork14Trangel {
    public static void main(String[] args) {
        triangel(9);
        triangelFloyd(9);
    }


    //6.3 Floyd`s triangle
    //Треугольник Флойда является прямоугольным треугольником из натуральных чисел.
    // н назван в честь Роберта Флойда . Строки треугольника заполняются последовательными номерами,
    // начиная с 1 в верхнем левом углу:
    //
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    private static void triangelFloyd(int size) {
        int check=1;
        int num=1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= check; j++) {

                System.out.print(num+" ");
                num+=1;
            }
            check=check+1;
            System.out.println();

        }
    }

//     1
//    212
//   32123
//  4321234
// 543212345
    private static void triangel(int size) {
        String str = "";
        int num = 0;
        int quantity=1;
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");

            }
            for (int j = quantity; j >= 1; j--) {
                System.out.print(j);
            }


          for (int j = 2; j <= quantity; j++) {
                System.out.print(j);
            }
            quantity += 1;
            ///System.out.println("chek"+quantity);
            System.out.println();
        }
    }


}
