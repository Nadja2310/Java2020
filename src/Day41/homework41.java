package Day41;

import java.util.Arrays;

public class homework41 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4)));// → [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4, 4, 3, 1)));// → [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(3, 2, 2, 4)));// → [3, 4, 2, 2]
    }

    private static int[] fix34(int... args) {
        //int[] output=new int[args.length]
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 3) {
                for (int j = index; j < args.length; j++) {
                    if (args[j] == 4) {
                        int temp = args[i + 1];
                        args[i + 1] = args[j];
                        args[j] = temp;
                        index = j;
                        break;
                    }
                }
            }
        }
        return args;
    }
}
