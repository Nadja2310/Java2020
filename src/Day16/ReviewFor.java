package Day16;

public class ReviewFor {
    public static void main(String[] args) {
     loopFor();
     whileLoop();
     doWhileLoop();
    }

    private static void doWhileLoop() {
        int i=10;
        do {
            System.out.println(i);
            i++;
        }while (i<9);
    }

    private static void whileLoop() {
        int i=10;
        while (i<20){
            System.out.println(i);
            i++;
        }

    }

    private static void loopFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >3 ; i--) {
            System.out.println(i);
        }
    }
}
