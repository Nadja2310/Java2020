package Day22;

public class Fibonacci {
    public static void main(String[] args) {
        findFibonacciNormal(7);
        System.out.println(findFibonacciRecursion(7));
    }

    private static int findFibonacciRecursion(int number) {
       if (number==0){
        return 0;
       }else if (number==1){
           return 1;
       }else{
           //прибавить предыдущее значение + значение перед ним
           return findFibonacciRecursion(number-1)+findFibonacciRecursion(number-2);
       }
    }

    private static void findFibonacciNormal(int number) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 2; i < number; i++) {
            n2 = n0 + n1;
            System.out.print(n2+" ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }
}
