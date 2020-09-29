package Day15;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(printLeapYears(2000, 2009));
    }


    // Реализовать метод, печатающий все високосные годы в интервале от year1 до year2
    //Пример: printLeapYears(2000,2009) ->
    private static String printLeapYears(int a, int b) {
        String strYear="";
        for (int i = a; i <=b ; i++) {
            if (checkLeapYear(i)) {
            strYear=strYear+" "+i;
            }

        }
return strYear;
    }

    private static boolean checkLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0;
    }
}
