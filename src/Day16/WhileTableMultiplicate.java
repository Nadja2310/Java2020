package Day16;

public class WhileTableMultiplicate {
    public static void main(String[] args) {
        createTable(10);

    }
    private static void createTable(int number) {
        int i = 1;

        while (i <= number) {
            int j = 1;
            while (j <= number) {
                System.out.printf("%3d", i * j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
