package Day3.hw3;

public class MyLovelyBank<privat> {
    public static void main(String[] args) {

        bankAccount(1000, 7, 3.5);
    }


    private static void bankAccount(double money, int year, double interest) {
        double result = money * interest * year / 100 + money;

        System.out.println("TOTAL: "+result);
    }
}
