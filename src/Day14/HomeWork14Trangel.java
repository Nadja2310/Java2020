package Day14;

public class HomeWork14Trangel {
    public static void main(String[] args) {
        triangel(10);
    }

    private static void triangel(int size) {

        String str = "";
        int num = 0;
        int quantity=1;
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");

            }
            for (int j = quantity; j >= 1; j--) {
                str=""+j;
                num=j;
            }
            //str=""+num;
           System.out.print(str);

         /* for (int j = 1; j <= quantity; j++) {
                System.out.print(j);
            }*/
            quantity += 1;
            System.out.println();
        }
    }


}
